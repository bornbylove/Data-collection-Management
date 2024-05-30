package com.ebenz.camel_microservice_b.routes;

import com.ebenz.camel_microservice_b.CamelMicroserviceBApplication;
import com.ebenz.camel_microservice_b.dto.JsonRecord;
import com.ebenz.camel_microservice_b.entity.DataRecord;
import com.ebenz.camel_microservice_b.repo.DataRecordRepository;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FileRouter extends RouteBuilder {
//    public static void main(String[] args) throws Exception {
//        FileRouter fileRouter = new FileRouter();
//        fileRouter.configure();
//
//
//    }

    @Autowired
    private DataRecordRepository dataRecordRepository;

//    public FileRouter(DataRecordRepository dataRecordRepository) {
//        this.dataRecordRepository = dataRecordRepository;
//    }

    @Override
    public void configure() throws Exception {
        System.out.println("INSIDE CONFIG");
        from("file:files/Thyroid_Diffs?noop=true")
                .log("File detected: ${file:name}")
                //.unmarshal(new BindyCsvDataFormat(CsvRecord.class))
                .unmarshal().json(JsonLibrary.Jackson, JsonRecord[].class)
                //.unmarshal().bindy(BindyType.Csv, CsvRecord.class)
                .log("Unmarshalled ${body}")
                .process(exchange -> {
                    JsonRecord[] recordsArray = exchange.getIn().getBody(JsonRecord[].class);
                    List<JsonRecord> recordList = Arrays.asList(recordsArray);
                    exchange.getIn().setBody(recordList);
                })
                .split(body())
                .process(exchange -> {
                    try {
                        //String adenopathy = exchange.getIn().getBody(String.class);
                        JsonRecord jsonRecord = exchange.getIn().getBody(JsonRecord.class);
                        DataRecord dataRecord = new DataRecord();
                        dataRecord.setAge(jsonRecord.getAge());
                        dataRecord.setAdenopathy(jsonRecord.getAdenopathy());
                        dataRecord.setFocality(jsonRecord.getFocality());
                        dataRecord.setHx_Radiotherapy(jsonRecord.getHx_Radiothreapy());
                        dataRecord.setGender(jsonRecord.getGender());
                        dataRecord.setM(jsonRecord.getM());
                        dataRecord.setAge(jsonRecord.getAge());
                        dataRecord.setN(jsonRecord.getN());
                        dataRecord.setT(jsonRecord.getT());
                        dataRecord.setHx_Smoking(jsonRecord.getHx_Smoking());
                        dataRecord.setPathology(jsonRecord.getPathology());
                        dataRecord.setPhysical_Examination(jsonRecord.getPhysical_Examination());
                        dataRecord.setRecurred(jsonRecord.getRecurred());
                        dataRecordRepository.saveDataRecord(dataRecord);
                        log.info("Data saved: " + dataRecord);
                        //dataRecord.setAdenopathy(adenopathy);

                        log.info("My data: ${body}");
                    } catch (Exception e) {
                        log.error("Error processing record ", e.getMessage(), e);
                    }

                })
                .log("Processing completed for file: ${file:name}");
//        from("file:files/Thyroid_Diffs/?noop=true")
//                .log("File detected: ${file:name}")
//                .to("log:file-content");

        //.to("file:files/output");
        //.log("Data Saved: ${body}");
    }
}

