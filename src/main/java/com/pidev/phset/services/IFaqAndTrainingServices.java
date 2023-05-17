package com.pidev.phset.services;

import com.pidev.phset.entities.*;
import java.util.List;
import java.util.Set;

public interface IFaqAndTrainingServices {

    /////////// ***** CERTIFICATE ***** ///////////

    Certificate addCertificate(Certificate certificate);
    Certificate updateCertificate(Integer idCertificate, Certificate certificate);
    void removeCertificate(Integer idCertif);
    Certificate retrieveCertificate(Integer idCertif);
    List<Certificate> retrieveAllCertificates();
    List<Certificate> retrieveAllCertificatesByAccount(Integer idAccount);

    /////////// ***** CHAPTER ***** ///////////

    Chapter addChapter(Chapter chapter);
    Chapter updateChapter(Integer idChapter,Chapter chapter);
    void removeChapter(Integer idChapter);
    Chapter retrieveChapter(Integer idChapter);
    List<Chapter> retrieveAllChapters();
    Set<Chapter> retrieveChaptersByIdCourse(Integer idCourse);

    /////////// ***** COURSE ***** ///////////

    Course addCourse(Course course);
    Course updateCourse(Integer idCourse,Course course);
    void removeCourse(Integer idCourse);
    Course retrieveCourse(Integer idCours);
    List<Course> retrieveAllCourses();

    /////////// ***** EXAM ***** ///////////

    Exam addExam(Exam exam);
    Exam updateExam(Integer idExam,Exam exam);
    void removeExam(Integer idExam);
    Exam retrieveExam(Integer idExam);
    List<Exam> retrieveAllExams();

    /////////// ***** QUESTIONEXAM ***** ///////////

    QuestionExam addQuestionExam(QuestionExam questionExam);
    QuestionExam updateQuestionExam(Integer idQuestionExam,QuestionExam questionExam);
    void removeQuestionExam(Integer idQuestionExam);
    QuestionExam retrieveQuestionExam(Integer idQuestionExam);
    List<QuestionExam> retrieveAllQuestionExam();
    String addQuestionAndResponseExam(QuestionExam question);
    /////////// ***** QUESTIONFAQ ***** ///////////

    String addQuestionFAQ(QuestionFAQ questionFAQ);
    QuestionFAQ updateQuestionFAQ(Integer idQuestionFAQ,QuestionFAQ questionFAQ);
    void removeQuestionFAQ(Integer idFAQ);
    QuestionFAQ retrieveQuestionFAQ(Integer idFAQ);
    List<QuestionFAQ> retrieveAllQuestionFAQs();

    /////////// ***** REPONSEEXAM ***** ///////////

    ReponseExam addReponseExam(ReponseExam reponseExam);
    ReponseExam updateReponseExam(Integer idReponseExam,ReponseExam reponseExam);
    void removeReponseExam(Integer idReponseExam);
    ReponseExam retrieveReponseExam(Integer idReponseExam);
    List<ReponseExam> retrieveAllReponseExam();

    /////////// ***** REPONSEFAQ ***** ///////////

    ReponseFAQ addReponseFAQ(ReponseFAQ reponseFAQ);
    ReponseFAQ updateReponseFAQ(Integer idReponseFAQ,ReponseFAQ reponseFAQ);
    void removeReponseFAQ(Integer idReponseFAQ);
    ReponseFAQ retrieveReponseFAQ(Integer idReponseFAQ);
    List<ReponseFAQ> retrieveAllReponseFAQs();

    /////////// ***** REQUEST ***** ///////////

    RequestTraining addRequest(RequestTraining requestTraining);
    RequestTraining updateRequest(Integer idRequest,RequestTraining requestTraining);
    void removeRequest(Integer idRequest);
    RequestTraining retrieveRequest(Integer idRequest);
    List<RequestTraining> retrieveAllRequests();

    /////////// ***** TAG ***** ///////////

    Tag addTag(Tag tag);
    Tag updateTag(Integer idTag,Tag tag);
    void removeTag(Integer idTag);
    Tag retrieveTag(Integer idTag);
    List<Tag> retrieveAllTags();

    /////////// ***** TOPIC ***** ///////////

    Topic addTopic(Topic topic);
    Topic updateTopic(Integer idTopic,Topic topic);
    void removeTopic(Integer idTopic);
    Topic retrieveTopic(Integer idTopic);
    List<Topic> retrieveAllTopics();

    /////////// ***** TRAINING ***** ///////////

    Training addTraining(Training training);
    Training updateTraining(Integer idTraining,Training training);
    void removeTraining(Integer idTraining);
    Training retrieveTraining(Integer idTraining);
    List<Training> retrieveAllTrainings();
    List<String> retrieveAllTrainingsNames();

    /////////// ***** TrainingOpinion ***** ///////////

    TrainingOpinion addTrainingOpinion(TrainingOpinion trainingOpinion);
    TrainingOpinion updateTrainingOpinion(Integer idTrainingOpinion,TrainingOpinion trainingOpinion);
    void removeTrainingOpinion(Integer idTrainingOpinion);
    TrainingOpinion retrieveTrainingOpinion(Integer idTrainingOpinion);
    List<TrainingOpinion> retrieveAllTrainingOpinions();


    ///////////////////////////// ********** AVNANCEES ********** /////////////////////////////////::

    /***************************** haut **************************************/

    String addTrainingAndAssignCourse(Technology technology,Training training);

    String addCourseAndChapters(Technology technology,Course course);

    String addExamAndAffectToCourseAndAssignQuestionAndResponse(Exam exam,Integer idCourse);

    String setTrainingStateAndAffectCertificate();

    String addOpinionToTraining(Integer id, String avis);

    /* *********************** bas ******************************************* */

    String addQuestionFAQAndTags(QuestionFAQ questionFAQ);
    String addResponseFAQToQuestionFAQAndAssignTopic(Integer idQ, ReponseFAQ r,Integer idT);

    String addTagsToQuestionFAQ(Integer idT, String tagtext);

    Set<String> extractAndSaveWordFromQuestion(String question);

    void searchPossiblesQuestionsResponses(String question);

    List<QuestionFAQ> getNewQuestionFAQ();
    String addResponse(Integer idQ, ReponseFAQ r);
    /* *********************** API ******************************************* */


    //////// TWILIO SMS ////////

//    //Admission addAdmission(Admission admission);
//    void sendReponseSMS(Integer id);
//    void sendSMS(String toPhoneNumber, String message);

    ////////////// MAIL ///////////////

//    String sendMail();
//    String sendMailAttachment() throws MessagingException;
//
//    void sendMailcertif(Integer id);

}
