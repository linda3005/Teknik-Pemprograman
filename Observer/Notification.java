import java.util.*;

public class Notification {
 public static void main(String[] args) {
  SubjectConcrete subject = new SubjectConcrete();
  subject.Add(new User(subject, "Linda"));
  subject.Add(new User(subject, "Tobby"));
  subject.SetStatus("Selamat Pagi");
  subject.Notif();
 }
}

interface Subject{
 public void Add(ObServer observer);
 public void Remove(ObServer observer);
 public void Notif();
}

interface ObServer{
 public void Update();
}

class SubjectConcrete implements Subject{
 private List<ObServer> list_observer = new ArrayList<ObServer>(); 
 private String SubjectStatus;
 public void SetStatus(String status){
  this.SubjectStatus = status;
 }
 public String GetStatus(){
  return this.SubjectStatus;
 }
 @Override
 public void Add(ObServer observer) {
  list_observer.add(observer);
 }
 
 @Override
 public void Remove(ObServer observer) {
  list_observer.remove(observer);
 }
 
 @Override
 public void Notif() {
  for(ObServer list : list_observer){
   list.Update();
  }
 }
}

class User implements ObServer{
 private String name;
 private SubjectConcrete subject;
 public User(SubjectConcrete subject,String name) {
  this.subject = subject;
  this.name = name;
 }
 
 public void SetName(String name){
  this.name = name;
 }
 
 public String GetName(){
  return this.name;
 }
 
 public void SetSubject(SubjectConcrete subject){
  this.subject = subject;
 }
 
 public SubjectConcrete GetSubject(){
  return this.subject;
 }
 
 @Override
 public void Update() {
  System.out.println(this.name+" membaca status barunya '"+this.subject.GetStatus()+"'");
 }
}