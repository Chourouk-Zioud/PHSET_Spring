package com.pidev.phset.controllers;

import com.pidev.phset.entities.*;
import com.pidev.phset.services.IFaqAndTrainingServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class FaqAndTrainingController {

    @Autowired IFaqAndTrainingServices faqAndTrainingServices;


    /////////// ***** CERTIFICATE ***** ///////////

    @PostMapping("/addCertificate")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return faqAndTrainingServices.addCertificate(certificate);
    }

    @PutMapping("/updateCertificate/{idCertificate}")
    public Certificate updateCertificate(@PathVariable("idCertificate") Integer idCertificate, @RequestBody Certificate certificate) {
        return faqAndTrainingServices.updateCertificate(idCertificate,certificate);
    }

    @GetMapping("/removeCertificate/{idCertif}")
    public void removeCertificate(@PathVariable("idCertif") Integer idCertif) {
        faqAndTrainingServices.removeCertificate(idCertif);
    }

    @GetMapping("/retrieveCertificate/{idCertif}")
    public Certificate retrieveCertificate(@PathVariable("idCertif") Integer idCertif) {
        return faqAndTrainingServices.retrieveCertificate(idCertif);
    }

    @GetMapping("/retrieveAllCertificates")
    public List<Certificate> retrieveAllCertificates() {
        return faqAndTrainingServices.retrieveAllCertificates();
    }

    @GetMapping("/retrieveAllCertificatesByAccount/{idAccount}")
    public List<Certificate> retrieveAllCertificatesByAccount(@PathVariable("idAccount") Integer idAccount){
        return faqAndTrainingServices.retrieveAllCertificatesByAccount(idAccount);
    }

    /////////// ***** CHAPTER ***** ///////////

    @PostMapping("/addChapter")
    public Chapter addChapter(@RequestBody Chapter chapter) {
        return faqAndTrainingServices.addChapter(chapter);
    }

    @PutMapping("/updateChapter/{idChapter}")
    public Chapter updateChapter(@PathVariable("idChapter") Integer idChapter,@RequestBody Chapter chapter) {
        return faqAndTrainingServices.updateChapter(idChapter,chapter);
    }

    @GetMapping("/removeChapter/{idChapter}")
    public void removeChapter(@PathVariable("idChapter") Integer idChapter) {
        faqAndTrainingServices.removeChapter(idChapter);
    }

    @GetMapping("/retrieveChapter/{idChapter}")
    public Chapter retrieveChapter(@PathVariable("idChapter") Integer idChapter) {
        return faqAndTrainingServices.retrieveChapter(idChapter);
    }

    @GetMapping("/retrieveAllChapters")
    public List<Chapter> retrieveAllChapters() {
        return faqAndTrainingServices.retrieveAllChapters();
    }

    @GetMapping("/retrieveChaptersByIdCourse/{idCourse}")
    public Set<Chapter> retrieveChaptersByIdCourse(@PathVariable("idCourse") Integer idCourse) {
        return faqAndTrainingServices.retrieveChaptersByIdCourse(idCourse);
    }

    /////////// ***** COURSE ***** ///////////

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return faqAndTrainingServices.addCourse(course);
    }

    @PutMapping("/updateCourse/{idCourse}")
    public Course updateCourse(@PathVariable("idCourse")Integer idCourse,@RequestBody Course course) {
        return faqAndTrainingServices.updateCourse(idCourse,course);
    }

    @GetMapping("/removeCourse/{idCourse}")
    public void removeCourse(@PathVariable("idCourse") Integer idCourse) {
        faqAndTrainingServices.removeCourse(idCourse);
    }

    @GetMapping("/retrieveCourse/{idCourse}")
    public Course retrieveCourse(@PathVariable("idCourse") Integer idCourse) {
        return faqAndTrainingServices.retrieveCourse(idCourse);
    }

    @GetMapping("/retrieveAllCourses")
    public List<Course> retrieveAllCourse() {
        return faqAndTrainingServices.retrieveAllCourses();
    }


    /////////// ***** EXAM ***** ///////////

    @PostMapping("/addExam")
    public Exam addExam(@RequestBody Exam exam) {
        return faqAndTrainingServices.addExam(exam);
    }

    @PutMapping("/updateExam/{idExam}")
    public Exam updateExam(@PathVariable("idExam") Integer idExam,@RequestBody Exam exam) {
        return faqAndTrainingServices.updateExam(idExam,exam);
    }

    @GetMapping("/removeExam/{idExam}")
    public void removeExam(@PathVariable("idExam") Integer idExam) {
        faqAndTrainingServices.removeExam(idExam);
    }

    @GetMapping("/retrieveExam/{idExam}")
    public Exam retrieveExam(@PathVariable("idExam") Integer idExam) {
        return faqAndTrainingServices.retrieveExam(idExam);
    }

    @GetMapping("/retrieveAllExams")
    public List<Exam> retrieveAllExams() {
        return faqAndTrainingServices.retrieveAllExams();
    }

    /////////// ***** QUESTIONEXAM ***** ///////////

    @PostMapping("/addQuestionExam")
    public QuestionExam addQuestionExam(@RequestBody QuestionExam questionExam) {
        return faqAndTrainingServices.addQuestionExam(questionExam);
    }

    @PutMapping("/updateQuestionExam/{idQuestionExam}")
    public QuestionExam updateQuestionExam(@PathVariable("idQuestionExam") Integer idQuestionExam,@RequestBody QuestionExam questionExam) {
        return faqAndTrainingServices.updateQuestionExam(idQuestionExam,questionExam);
    }

    @GetMapping("/removeQuestionExam/{idQuestionExam}")
    public void removeQuestionExam(@PathVariable("idQuestionExam") Integer idQuestionExam) {
        faqAndTrainingServices.removeQuestionExam(idQuestionExam);
    }

    @GetMapping("/retrieveQuestionExam/{idQuestionExam}")
    public QuestionExam retrieveQuestionExam(@PathVariable("idQuestionExam") Integer idQuestionExam) {
        return faqAndTrainingServices.retrieveQuestionExam(idQuestionExam);
    }

    @GetMapping("/retrieveAllQuestionExamS")
    public List<QuestionExam> retrieveAllQuestionExam() {
        return faqAndTrainingServices.retrieveAllQuestionExam();
    }

    @PostMapping("/addQuestionAndResponseExam")
    public String addQuestionAndResponseExam(QuestionExam question){
        return faqAndTrainingServices.addQuestionAndResponseExam(question);
    }
    /////////// ***** QUESTIONFAQ ***** ///////////

    @PostMapping("/addQuestionFAQ")
    public String addQuestionFAQ(@RequestBody QuestionFAQ questionFAQ) {
        return faqAndTrainingServices.addQuestionFAQ(questionFAQ);
    }

    @PutMapping("/updateQuestionFAQ/{idQuestionFAQ}")
    public QuestionFAQ updateQuestionFAQ(@PathVariable("idQuestionFAQ") Integer idQuestionFAQ,@RequestBody QuestionFAQ questionFAQ) {
        return faqAndTrainingServices.updateQuestionFAQ(idQuestionFAQ,questionFAQ);
    }

    @GetMapping("/removeQuestionFAQ/{idQuestionFAQ}")
    public void removeQuestionFAQ(@PathVariable("idQuestionFAQ") Integer idQuestionFAQ) {
        faqAndTrainingServices.removeQuestionFAQ(idQuestionFAQ);
    }

    @GetMapping("/retrieveQuestionFAQ/{idFAQ}")
    public QuestionFAQ retrieveQuestionFAQ(@PathVariable("idFAQ") Integer idFAQ) {
        return faqAndTrainingServices.retrieveQuestionFAQ(idFAQ);
    }

    @GetMapping("/retrieveAllQuestionFAQS")
    public List<QuestionFAQ> retrieveAllQuestionFAQs() {
        return faqAndTrainingServices.retrieveAllQuestionFAQs();
    }

    /////////// ***** REPONSEEXAM ***** ///////////

    @PostMapping("/addReponseExam")
    public ReponseExam addReponseExam(@RequestBody ReponseExam reponseExam) {
        return faqAndTrainingServices.addReponseExam(reponseExam);
    }

    @PutMapping("/updateReponseExam/{idReponseExam}")
    public ReponseExam updateReponseExam(@PathVariable("idReponseExam") Integer idReponseExam,@RequestBody ReponseExam reponseExam) {
        return faqAndTrainingServices.updateReponseExam(idReponseExam,reponseExam);
    }

    @GetMapping("/removeReponseExam/{idReponseExam}")
    public void removeReponseExam(@PathVariable("idReponseExam") Integer idReponseExam) {
        faqAndTrainingServices.removeReponseExam(idReponseExam);
    }

    @GetMapping("/retrieveReponseExam/{idReponseExam}")
    public ReponseExam retrieveReponseExam(@PathVariable("idReponseExam") Integer idReponseExam) {
        return faqAndTrainingServices.retrieveReponseExam(idReponseExam);
    }

    @GetMapping("/retrieveAllReponseExam")
    public List<ReponseExam> retrieveAllReponseExam() {
        return faqAndTrainingServices.retrieveAllReponseExam();
    }

    /////////// ***** REPONSEFAQ ***** ///////////

    @PostMapping("/addReponseFAQ")
    public ReponseFAQ addReponseFAQ(@RequestBody ReponseFAQ reponseFAQ) {
        return faqAndTrainingServices.addReponseFAQ(reponseFAQ);
    }

    @PutMapping("/updateReponseFAQ/{idReponseFAQ}")
    public ReponseFAQ updateReponseFAQ(@PathVariable("idReponseFAQ") Integer idReponseFAQ,@RequestBody ReponseFAQ reponseFAQ) {
        return faqAndTrainingServices.updateReponseFAQ(idReponseFAQ,reponseFAQ);
    }

    @GetMapping("/removeReponseFAQ/{idReponseFAQ}")
    public void removeReponseFAQ(@PathVariable("idReponseFAQ") Integer idReponseFAQ) {
        faqAndTrainingServices.removeReponseFAQ(idReponseFAQ);
    }

    @GetMapping("/retrieveReponseFAQ/{idReponseFAQ}")
    public ReponseFAQ retrieveReponseFAQ(@PathVariable("idReponseFAQ") Integer idReponseFAQ) {
        return faqAndTrainingServices.retrieveReponseFAQ(idReponseFAQ);
    }

    @GetMapping("/retrieveAllReponseFAQ")
    public List<ReponseFAQ> retrieveAllReponseFAQs() {
        return faqAndTrainingServices.retrieveAllReponseFAQs();
    }

    ////////////////////////////////////////////////////////////////////////////////

    @PostMapping("/addRequest")
    public RequestTraining addRequest(@RequestBody RequestTraining request) {
        return faqAndTrainingServices.addRequest(request);
    }

    @PutMapping("/updateRequest/{idRequest}")
    public RequestTraining updateRequest(@PathVariable("idRequest") Integer idRequest,@RequestBody RequestTraining request) {
        return faqAndTrainingServices.updateRequest(idRequest,request);
    }

    @GetMapping("/removeRequest/{idRequest}")
    public void removeRequest(@PathVariable("idRequest") Integer idRequest) {
        faqAndTrainingServices.removeReponseFAQ(idRequest);
    }

    ////////////////////////////////////////////////////////////////////////////

    /////////// ***** TAG ***** ///////////

    @PostMapping("/addTag")
    public Tag addTag(@RequestBody Tag tag) {
        return faqAndTrainingServices.addTag(tag);
    }

    @PutMapping("/updateTag/{idTag}")
    public Tag updateTag(@PathVariable("idTag") Integer idTag,@RequestBody Tag tag) {
        return faqAndTrainingServices.updateTag(idTag,tag);
    }

    @GetMapping("/removeTag/{idTag}")
    public void removeTag(@PathVariable("idTag") Integer idTag) {
        faqAndTrainingServices.removeTag(idTag);
    }

    @GetMapping("/retrieveTag/{idTag}")
    public Tag retrieveTag(@PathVariable("idTag") Integer idTag) {
        return faqAndTrainingServices.retrieveTag(idTag);
    }

    @GetMapping("/retrieveAllTags")
    public List<Tag> retrieveAllTags() {
        return faqAndTrainingServices.retrieveAllTags();
    }

    /////////// ***** TOPIC ***** ///////////

    @PostMapping("/addTopic")
    public Topic addTopic(@RequestBody Topic topic) {
        return faqAndTrainingServices.addTopic(topic);
    }

    @PutMapping("/updateTopic/{idTopic}")
    public Topic updateTopic(@PathVariable("idTopic") Integer idTopic,@RequestBody Topic topic) {
        return faqAndTrainingServices.updateTopic(idTopic,topic);
    }

    @GetMapping("/removeTopic/{idTopic}")
    public void removeTopic(@PathVariable("idTopic") Integer idTopic) {
        faqAndTrainingServices.removeTopic(idTopic);
    }

    @GetMapping("/retrieveTopic/{idTopic}")
    public Topic retrieveTopic(@PathVariable("idTopic") Integer idTopic) {
        return faqAndTrainingServices.retrieveTopic(idTopic);
    }

    @GetMapping("/retrieveAllTopics")
    public List<Topic> retrieveAllTopics() {
        return faqAndTrainingServices.retrieveAllTopics();
    }

    /////////// ***** TRAINING ***** ///////////

    @PostMapping("/addTraining")
    public Training addTraining(@RequestBody Training training) {
        return faqAndTrainingServices.addTraining(training);
    }

    @PutMapping("/updateTraining/{idTraining}")
    public Training updateTraining(@PathVariable("idTraining") Integer idTraining,@RequestBody Training training) {
        return faqAndTrainingServices.updateTraining(idTraining,training);
    }

    @GetMapping("/removeTraining/{idTraining}")
    public void removeTraining(@PathVariable("idTraining") Integer idTraining) {
        faqAndTrainingServices.removeTraining(idTraining);
    }

    @GetMapping("/retrieveTraining/{idTraining}")
    public Training retrieveTraining(@PathVariable("idTraining") Integer idTraining) {
        return faqAndTrainingServices.retrieveTraining(idTraining);
    }

    @GetMapping("/retrieveAllTraining")
    public List<Training> retrieveAllTrainings() {
        return faqAndTrainingServices.retrieveAllTrainings();
    }

    @GetMapping("/retrieveAllTrainingsNames")
    public List<String> retrieveAllTrainingsNames() {
        return faqAndTrainingServices.retrieveAllTrainingsNames();
    }

        /////////// ***** TRAININGOPINION ***** ///////////

    @PostMapping("/addTrainingOpinion")
    public TrainingOpinion addTrainingOpinion(@RequestBody TrainingOpinion trainingOpinion) {
        return faqAndTrainingServices.addTrainingOpinion(trainingOpinion);
    }

    @PutMapping("/updateTrainingOpinion/{idTrainingOpinion}")
    public TrainingOpinion updateTrainingOpinion(@PathVariable("idTrainingOpinion")Integer idTrainingOpinion,@RequestBody TrainingOpinion trainingOpinion) {
        return faqAndTrainingServices.updateTrainingOpinion(idTrainingOpinion,trainingOpinion);
    }

    @GetMapping("/removeTrainingOpinion/{idTrainingOpinion}")
    public void removeTrainingOpinion(@PathVariable("idTrainingOpinion") Integer idTrainingOpinion) {
        faqAndTrainingServices.removeTrainingOpinion(idTrainingOpinion);
    }

    @GetMapping("/retrieveTrainingOpinion/{idTrainingOpinion}")
    public TrainingOpinion retrieveTrainingOpinion(@PathVariable("idTrainingOpinion") Integer idTrainingOpinion) {
        return faqAndTrainingServices.retrieveTrainingOpinion(idTrainingOpinion);
    }

    @GetMapping("/retrieveAllTrainingOpinions")
    public List<TrainingOpinion> retrieveAllTrainingOpinions() {
        return faqAndTrainingServices.retrieveAllTrainingOpinions();
    }

/////////////////////////////////////////////////////////////////

    @PostMapping("/addTrainingAndAssignCourse")
    public String addTrainingAndAssignCourse(Technology technology, @RequestBody Training training) {
        return faqAndTrainingServices.addTrainingAndAssignCourse(technology, training);
    }

    @PostMapping("/addCourseAndChapters")
    public String addCourseAndChapters(Technology technology,@RequestBody Course course){
        return faqAndTrainingServices.addCourseAndChapters(technology,course);
    }

    @PutMapping("/addExamAndAffectToCourseAndAssignQuestionAndResponse/{idCourse}")
    public String addExamAndAffectToCourseAndAssignQuestionAndResponse(@RequestBody Exam exam,@PathVariable("idCourse") Integer idCourse){
        return  faqAndTrainingServices.addExamAndAffectToCourseAndAssignQuestionAndResponse(exam,idCourse);
    }

    @PostMapping("/setTrainingStateAndAffectCertificate")
    public String setTrainingStateAndAffectCertificate(){
        return faqAndTrainingServices.setTrainingStateAndAffectCertificate();
    };

    @PutMapping("/addOpinionToTraining/{id}/{avis}")
    public String addOpinionToTraining(@PathVariable("id") Integer id,@PathVariable("avis") String avis){
        return faqAndTrainingServices.addOpinionToTraining(id,avis);
    }

    @PutMapping("/addResponseFAQToQuestionFAQAndAssignTopic/{idQ}/{idT}")
    public String addResponseFAQToQuestionFAQAndAssignTopic(@PathVariable("idQ") Integer idQ,@RequestBody ReponseFAQ r,@PathVariable("idT") Integer idT){
        return faqAndTrainingServices.addResponseFAQToQuestionFAQAndAssignTopic(idQ,r,idT);
    };

    @PutMapping("/addTagsToQuestionFAQ/{idQ}")
    String addTagsToQuestionFAQ(@PathVariable("idQ") Integer idQ, String tagtext){
        return faqAndTrainingServices.addTagsToQuestionFAQ(idQ, tagtext);
    }

    @PostMapping("/extractAndSaveWordFromQuestion")
    Set<String> extractAndSaveWordFromQuestion(String question){
        return faqAndTrainingServices.extractAndSaveWordFromQuestion(question);
    }

    @PostMapping("/addQuestionFAQAndTags")
    String addQuestionFAQAndTags(@RequestBody QuestionFAQ questionFAQ){
        return faqAndTrainingServices.addQuestionFAQAndTags(questionFAQ);
    }

    @GetMapping("/searchPossiblesQuestionsResponses")
    public void searchPossiblesQuestionsResponses(String question){
        faqAndTrainingServices.searchPossiblesQuestionsResponses(question);
    }

    @GetMapping("/getNewQuestionFAQ")
    public List<QuestionFAQ> getNewQuestionFAQ(){
        return faqAndTrainingServices.getNewQuestionFAQ();
    }

    @PostMapping("/addResponse/{idQ}")
    public String addResponse(@PathVariable("idQ") Integer idQ,@RequestBody ReponseFAQ r){
        return faqAndTrainingServices.addResponse(idQ , r);
    }


//
//    @RequestMapping("/sendReponseSMS/{id}")
//    public void sendReponseSMS(@PathVariable("id") Integer id){
//        faqAndTrainingServices.sendReponseSMS(id);
//    }

////////////// UPLOAD & SAVE PDF ///////////////

//    @ApiOperation(value = "Upload a PDF file", consumes = "multipart/form-data", produces = "application/json")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "File uploaded successfully"),
//            @ApiResponse(responseCode = "400", description = "Invalid file format")
//    })
//    @PostMapping(value = "/uploadAndSavePDF", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public String uploadFile(@ApiParam(value = "Select a PDF file to upload", required = true)
//                             @RequestParam("file") MultipartFile file) throws IOException {
//
//        // Check if the file is a PDF file
//        if (!file.getContentType().equals(MediaType.APPLICATION_PDF_VALUE)) {
//            return ("Invalid file format");
//        }
//
//        // Code to save the PDF file
//        Path filePath = Paths.get("C:\\Users\\chalg\\OneDrive\\Documents\\1_ESPRIT_4SE5_SEMETRE_2\\PIDEV\\PHSET-Spring-Angular\\src\\main\\java\\com\\pidev\\phset\\uploadedFiles\\" + file.getOriginalFilename());
//        Files.write(filePath, file.getBytes());
//
//        String path = filePath.toString();
//
//        return path;
//    }

    ////////////// MAIL ///////////////
//
//    @RequestMapping("/sendMail")
//    public String sendMail() {
//        return faqAndTrainingServices.sendMail();
//    }
//
//    @RequestMapping("/sendMailAtt")
//    public String sendMailAttachment() throws MessagingException {
//        return faqAndTrainingServices.sendMailAttachment();
//    }
//
//    @RequestMapping("/sendMailcertif")
//    public void sendMailcertif(Integer id){
//        faqAndTrainingServices.sendMailcertif(id);
//    }




}

