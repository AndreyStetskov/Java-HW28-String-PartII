package com.andrey.homework28stringpartii;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScheduleController {
    private List<Subject> telRun;

    public ScheduleController() {
        telRun = new ArrayList<>();

        telRun.add(new Subject("268ad2aa-5611-4e56-9662-447bbecfd934",
                "Java Basic",
                48,
                List.of("Module1",
                        "Module2",
                        "Module3")));
        telRun.add(new Subject("5c44dabc-81c0-4772-b126-6ff26c7cc7d6",
                "Basic FE",
                48,
                List.of("Module1",
                        "Module2")));
        telRun.add(new Subject("a1bccc43-36f9-4e1b-8615-d5ddb725327f ",
                "QA",
                24,
                List.of("Module1")));
        telRun.add(new Subject("4479ec45-2b1e-4d9e-9698-a9b3f7126445",
                "Java Pro",
                48,
                List.of("Module1",
                        "Module2",
                        "Module3",
                        "Module4",
                        "Module5",
                        "Module6")));
        telRun.add(new Subject("3867b815-9199-423c-943e-f032aec862cc",
                "Algorithms",
                40,
                List.of("Module1",
                        "Module2")));
        telRun.add(new Subject("8a0a16a6-61ae-4f1f-8d90-377bd8b94e9c",
                "General Technologies",
                40,
                List.of("Module1",
                        "Module2")));
        telRun.add(new Subject("57d2d97c-a242-4245-a469-3dba7212eb2b",
                "English for IT",
                40,
                List.of("Module1")));
    }

    @GetMapping(value = "/schedule")
    public List<Subject> getSchedule() {
        return telRun;
    }

    @GetMapping(value = "/schedule/{id}")
    public Subject getScheduleById(@PathVariable String id) {
        int numberId = Integer.parseInt(id);
        return telRun.get(numberId);
    }

    @PostMapping(value = "/schedule")
    public Subject addSubject(@RequestBody Subject subject) {
        telRun.add(subject);
        return subject;
    }

    @DeleteMapping(value = "/schedule/{id}")
    public void deleteSubject(@PathVariable String id) {
        int numberId = Integer.parseInt(id);
        telRun.remove(numberId);
    }

    @PutMapping(value = "/schedule/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
        int numberId = Integer.parseInt(id);
        telRun.set(numberId, subject);
    }

    @GetMapping(value = "/schedule/all")
    public List<Subject> getAllSchedule() {
        return telRun;
    }

    @DeleteMapping(value = "/allSchedule/all")
    public void deleteAllSubject() {
        telRun.clear();
    }

    @GetMapping(value = "/schedule/count")
    public int getCountSubject() {
        if (telRun == null) {
            return 0;
        }

        return telRun.size();
    }
}
