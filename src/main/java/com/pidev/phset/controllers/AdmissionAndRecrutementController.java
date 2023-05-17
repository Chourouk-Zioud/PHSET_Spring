package com.pidev.phset.controllers;

import com.pidev.phset.entities.*;
import com.pidev.phset.repositories.IAccountRepository;
import com.pidev.phset.repositories.IInscriptionRepository;
import com.pidev.phset.repositories.IOfferRepository;
import com.pidev.phset.services.IAdmissionAndRecrutementServices;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class AdmissionAndRecrutementController {

    @Autowired IAdmissionAndRecrutementServices admissionAndRecrutementServices;
    private final IInscriptionRepository iInscriptionRepository;
    private final IOfferRepository iOfferRepository;
    private final IAccountRepository iAccounRepository;


    @PostMapping("/addUser")
    User addUser(@RequestBody User user){
        return admissionAndRecrutementServices.addUser(user);
    }

    @PostMapping("/addAccount")
    Account addAccount(@RequestBody Account account){
        return admissionAndRecrutementServices.addAccount(account);
    }

    //////// **** CLASSROOM Services **** ////////

    @PostMapping("/addClassroom")
    Classroom addClassroom(@RequestBody Classroom classroom){
        return admissionAndRecrutementServices.addClassroom(classroom);
    }

    @PutMapping("/updateClassroom")
    Classroom updateClassroom(@RequestBody Classroom classroom){
        return admissionAndRecrutementServices.updateClassroom(classroom);
    }

    @GetMapping("/deleteClassroom/{id}")
    void removeClassroom(@PathVariable("id") Integer idClassroom){
        admissionAndRecrutementServices.removeClassroom(idClassroom);
    }

    @GetMapping("/retrieveClassroom/{id}")
    Classroom retrieveClassroom(@PathVariable("id") Integer idClassroom){
        return admissionAndRecrutementServices.retrieveClassroom(idClassroom);
    }

    @GetMapping("/retrieveAllClassrooms")
    List<Classroom> retrieveAllClassroom(){
        return admissionAndRecrutementServices.retrieveAllClassroom();
    }


    //////// **** CLASSState Services **** ////////
    @PostMapping("/addClassState")
    ClassState addClassState(@RequestBody ClassState classstate){
        return admissionAndRecrutementServices.addClassState(classstate);
    }

    @PutMapping("/updateClassState")
    ClassState updateClassState(@RequestBody ClassState classstate){
        return admissionAndRecrutementServices.updateClassState(classstate);
    }

    @GetMapping("/deleteClassState/{id}")
    void removeClassState(@PathVariable("id") Integer idClassState){
        admissionAndRecrutementServices.removeClassState(idClassState);
    }

    @GetMapping("/retrieveClassState/{id}")
    ClassState retrieveClassState(@PathVariable("id") Integer idClassState){
        return admissionAndRecrutementServices.retrieveClassState(idClassState);
    }

    @GetMapping("/retrieveAllClassStates")
    List<ClassState> retrieveAllClassState(){
        return admissionAndRecrutementServices.retrieveAllClassStates();
    }

    //////// **** INSCRIPTION Services **** ////////

    @PostMapping("/addInscription")
    Inscription addInscription(@RequestBody Inscription inscription){
        return admissionAndRecrutementServices.addInscription(inscription);
    }

    @PutMapping("/updateInscription")
    Inscription updateInscription(@RequestBody Inscription inscription){
        return admissionAndRecrutementServices.updateInscription(inscription);
    }

    @GetMapping("/deleteInscription/{id}")
    void removeInscription(@PathVariable("id") Integer idInscription){
        admissionAndRecrutementServices.removeInscription(idInscription);
    }

    @GetMapping("/retrieveInscription/{id}")
    Inscription retrieveInscription(@PathVariable("id") Integer idInscription){
        return admissionAndRecrutementServices.retrieveInscription(idInscription);
    }

    @GetMapping("/retrieveAllInscriptions")
    List<Inscription> retrieveAllInscription(){
        return admissionAndRecrutementServices.retrieveAllInscription();
    }

    @GetMapping("/findStatutInscriptionCurrentUser")
    boolean findStatutInscriptionCurrentUser(){
        return admissionAndRecrutementServices.findStatutInscriptionCurrentUser();
    }

    //////// **** INTERVIEW Services **** ////////

    @PostMapping("/addInterview")
    Interview addInterview(@RequestBody Interview interview){
        return admissionAndRecrutementServices.addInterview(interview);
    }

    @PutMapping("/updateInterview")
    Interview updateInterview(@RequestBody Interview interview){
        return admissionAndRecrutementServices.updateInterview(interview);
    }

    @GetMapping("/deleteInterview/{id}")
    void removeInterview(@PathVariable("id") Integer idInterview){
        admissionAndRecrutementServices.removeInterview(idInterview);
    }

    @GetMapping("/retrieveInterview/{id}")
    Interview retrieveInterview(@PathVariable("id") Integer idInterview){
        return admissionAndRecrutementServices.retrieveInterview(idInterview);
    }

    //@GetMapping("/retrieveInterviewByUser/{id}")
    //Interview retrieveInterviewByUser(@PathVariable("id") Integer idUser){
    //    return admissionAndRecrutementServices.retrieveInterviewByUser(idUser);
    //}

    @GetMapping("/retrieveInterviewByCurrentUser/{id}")
    List<Interview> retrieveInterviewByUser(@PathVariable("id") Integer idUser){
        return admissionAndRecrutementServices.retrieveInterviewByUser(idUser);
    }

    @GetMapping("/retrieveAllInterviews")
    List<Interview> retrieveAllInterview(){
        return admissionAndRecrutementServices.retrieveAllInterview();
    }


    //////// **** OFFER Services **** ////////

    @PostMapping("/addOffer")
    Offer addOffer(@RequestBody Offer offer){
        return admissionAndRecrutementServices.addOffer(offer);
    }

    @PutMapping("/updateOffer")
    Offer updateOffer(@RequestBody Offer offer){
        return admissionAndRecrutementServices.updateOffer(offer);
    }

    @GetMapping("/deleteOffer/{id}")
    void removeOffer(@PathVariable("id") Integer idOffer){
        admissionAndRecrutementServices.removeOffer(idOffer);
    }

    @GetMapping("/retrieveOffer/{id}")
    Offer retrieveOffer(@PathVariable("id") Integer idOffer){
        return admissionAndRecrutementServices.retrieveOffer(idOffer);
    }

    @GetMapping("/retrieveAllOffers")
    List<Offer> retrieveAllOffer(){
        return admissionAndRecrutementServices.retrieveAllOffer();
    }

    @GetMapping("/getAllOfferJob")
    public List<Offer> getAllOfferJob(){
        return admissionAndRecrutementServices.getAllOfferJob();
    }

    @GetMapping("/getAllOfferAdmission")
    public List<Offer> getAllOfferAdmission(){
        return admissionAndRecrutementServices.getAllOfferAdmission();
    }

    //////// **** Algorithme

    @PostMapping("/addInscriptionTNWithUserAndAssignOffer/{idOffer}/{idAccount}")
    public String addInscriptionTNWithUserAndAssignOffer(@RequestBody Inscription inscription, @PathVariable("idOffer")  Integer idOffer, @PathVariable("idAccount")  Integer idAccount){
        return admissionAndRecrutementServices.addInscriptionTNWithUserAndAssignOffer(inscription,idOffer,idAccount);
    }

    @PostMapping("/addInscriptionALTWithUserAndAssignOffer/{idOffer}/{idAccount}")
    public String addInscriptionALTWithUserAndAssignOffer(@RequestBody Inscription inscription, @PathVariable("idOffer")  Integer idOffer, @PathVariable("idAccount")  Integer idAccount){
        return admissionAndRecrutementServices.addInscriptionALTWithUserAndAssignOffer(inscription,idOffer,idAccount);
    }

    @PostMapping("/addInscriptionINTWithUserAndAssignOffer/{idOffer}/{idAccount}")
    public String addInscriptionINTWithUserAndAssignOffer(@RequestBody Inscription inscription, @PathVariable("idOffer")  Integer idOffer, @PathVariable("idAccount")  Integer idAccount){
        return admissionAndRecrutementServices.addInscriptionINTWithUserAndAssignOffer(inscription,idOffer,idAccount);
    }

    @PostMapping("/addInscriptionJOBWithUserAndAssignOffer/{idOffer}/{idAccount}")
    public String addInscriptionJOBWithUserAndAssignOffer(@RequestBody Inscription inscription, @PathVariable("idOffer")  Integer idOffer, @PathVariable("idAccount")  Integer idAccount){
        return admissionAndRecrutementServices.addInscriptionJOBWithUserAndAssignOffer(inscription,idOffer,idAccount);
    }

    @PostMapping("/addInscriptionNIGHTWithUserAndAssignOffer/{idOffer}/{idAccount}")
    public String addInscriptionNIGHTWithUserAndAssignOffer(@RequestBody Inscription inscription, @PathVariable("idOffer")  Integer idOffer, @PathVariable("idAccount")  Integer idAccount){
        return admissionAndRecrutementServices.addInscriptionNIGHTWithUserAndAssignOffer(inscription,idOffer,idAccount);
    }

    @PostMapping(value ="/addInscriptionWithCVAndLM/{idOffer}/{idAccount}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String addInscriptionWithCVAndLM(@RequestBody Inscription inscription,@PathVariable("idOffer") Integer idOffer,@PathVariable("idAccount") Integer idAccount,@RequestParam(value = "cv", required = false) MultipartFile cv,@RequestParam(value = "lm", required = false) MultipartFile lm){
        return admissionAndRecrutementServices.addInscriptionWithCVAndLM(inscription, idOffer, idAccount, cv, lm);
    }

//    @PutMapping(value = "/setCVUser", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public void setCV(Principal principal, @RequestParam(value = "cv", required = false) MultipartFile multipartFile ) throws IOException{
//        admissionAndRecrutementServices.setCV(principal,multipartFile);


    @PostMapping("/addCandidacyAndAssignOffer/{idOffer}")
    public String addCandidacyAndAssignOffer(@RequestBody Candidacy candidacy,@PathVariable("idOffer") Integer idOffer){
        return admissionAndRecrutementServices.addCandidacyAndAssignOffer(candidacy,idOffer);
    }


    @PutMapping("/addInterviewAndAssignJuryAndCondidateAndClassroomToNewInscription")
    public void addInterviewAndAssignJuryAndCondidateAndClassroomToNewInscription(){
        admissionAndRecrutementServices.addInterviewAndAssignJuryAndCondidateAndClassroomToNewInscription();
    }

    ////////////////////////// TWILIO SMS //////////////////////////////////////////////////

//    @PostMapping("/api/TWILIO/addAdmission")
//    public ResponseEntity<Admission> addAdmission(@RequestBody Admission admission) {
//        Admission newAdmission = admissionAndRecrutementServices.addAdmission(admission);
//        return new ResponseEntity<>(newAdmission, HttpStatus.CREATED);
//    }
//
//    @PostMapping("/sendAcceptanceSMS/{id}")
//    public ResponseEntity<Void> sendAcceptanceSMS(@PathVariable Long id) {
//        admissionAndRecrutementServices.sendAcceptanceSMS(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    ////////////// EXTRACT TEXT FROM PDF ///////////////

    @GetMapping("/extractText")
    public ResponseEntity<String> extractText(@RequestParam("path") String path) {
        return admissionAndRecrutementServices.extractText(path);
    }

    @GetMapping("/extractTextFromPdf")
    public String extractTextFromPdf(@RequestParam("path") String path) throws IOException {
        return admissionAndRecrutementServices.extractTextFromPdf(path);
    }

    @GetMapping("/extractNiveauEtude")
    public String extractNiveauEtude(@RequestParam("path") String path) throws IOException {
        return admissionAndRecrutementServices.extractNiveauEtude(path);
    }

    @GetMapping("/extractSpecialite")
    public String extractSpecialite(@RequestParam("path") String path) throws IOException {
        return admissionAndRecrutementServices.extractSpecialite(path);
    }

    @GetMapping("/suggestNiveauEtudeAndSpecialite")
    public String suggestNiveauEtudeAndSpecialite(@RequestParam("niveauEtude") String niveauEtude, @RequestParam("specialite") String specialite) throws IOException {
        return admissionAndRecrutementServices.suggestNiveauEtudeAndSpecialite(niveauEtude,specialite);
    }

    ////////////// UPLOAD & SAVE PDF ///////////////
//
//    @ApiOperation(value = "Upload a PDF file", consumes = "multipart/form-data", produces = "application/json")
//    @ApiResponses(value = {
//                            @ApiResponse(responseCode = "200", description = "File uploaded successfully"),
//                            @ApiResponse(responseCode = "400", description = "Invalid file format")
//                            })
//    @PostMapping(value = "/uploadAndSavePDF", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public String uploadFile(@ApiParam(value = "Select a PDF file to upload", required = true)
//                                             @RequestParam("file") MultipartFile file) throws IOException {
//
//        // Check if the file is a PDF file
//        if (!file.getContentType().equals(MediaType.APPLICATION_PDF_VALUE)) {
//            return ("Invalid file format");
//        }
//
//        // Code to save the PDF file
//        Path filePath = Paths.get("C:\\Users\\LENOVO\\Documents\\ESPRIT\\Semester 2\\PIDEV\\PHSET-Spring-Angular\\src\\main\\java\\com\\pidev\\phset\\uploadedFiles\\" + file.getOriginalFilename());
//        Files.write(filePath, file.getBytes());
//
//        String path = filePath.toString();
//
//        return path;
//    }





//    @PostMapping("/upload")
//    public String uploadPDFFile(@RequestParam("file") MultipartFile file) throws IOException {
//        return admissionAndRecrutementServices.savePDFFile(file);
//    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(InvalidFileFormatException.class)
//    public String handleInvalidFileFormatException(InvalidFileFormatException e) {
//        return e.getMessage();
//    }


    @PutMapping(value = "/setCVUser", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void setCV(Principal principal, @RequestParam(value = "cv", required = false) MultipartFile multipartFile ) throws IOException{
        admissionAndRecrutementServices.setCV(principal,multipartFile);
    }

    @PutMapping(value = "/setLMUser", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void setLM(Principal principal, @RequestParam(value = "lm", required = false) MultipartFile multipartFile ) throws IOException{
        admissionAndRecrutementServices.setLM(principal,multipartFile);
    }

    ////////////// MAIL ///////////////

    @RequestMapping("/sendMail")
    public String sendMail() {
        return admissionAndRecrutementServices.sendMail();
    }

    @RequestMapping("/sendMailAtt")
    public String sendMailAttachment() throws MessagingException {
        return admissionAndRecrutementServices.sendMailAttachment();
    }

    @RequestMapping("/sendMailInterview")
    public void sendMailInterview(Date date, String salle, String bloc){
        admissionAndRecrutementServices.sendMailInterview(date,salle,bloc);
    }

    @GetMapping("/getAllInscriptionAsc")
    public List<Inscription> getAllInscriptionAsc(){
        return admissionAndRecrutementServices.getAllInscriptionAsc();
    }

    @GetMapping("/getInscriptionByOffer_OfferType/{offerType}")
    public List<Inscription> getInscriptionByOffer_OfferType(@PathVariable("offerType") TypeGrid offerType){
        return admissionAndRecrutementServices.getInscriptionByOffer_OfferType(offerType);
    }

    @GetMapping("/getInscriptionByDateInscription/{date}")
    public List<Inscription> getInscriptionByDateInscription(@PathVariable("date") Date date){
        return admissionAndRecrutementServices.getInscriptionByDateInscription(date);
    }

}


