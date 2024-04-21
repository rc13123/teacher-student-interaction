
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.File;
import java.util.ArrayList;


public class client 
{
    public static String SignUp(String username,String email,String password,String phone,File photo)
    {
        try
        {
            HttpResponse<String> res= Unirest.post("http://localhost:9000/signup")
                    .queryString("username",username)
                    .queryString("email",email)
                    .queryString("password",password)
                    .queryString("phone",phone)
                    .field("photo", photo)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String user_login(String email,String password)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/user_login")
                    
                    .queryString("email",email)
                    .queryString("password",password)
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    
     public static String delete(int id)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/delete")
                    
                    .queryString("id",id)
                    
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     
    public static String delete_course(int id)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/delete_course")
                    
                    .queryString("id",id)
                    
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    
     public static String delete_faculty(String email)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/delete_faculty")
                    
                    .queryString("email",email)
                    
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String delete_student(String email)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/delete_student")
                    
                    .queryString("email",email)
                    
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String delete_notes(String notes_id)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/delete_notes")
                    
                    .queryString("notes_id",notes_id)
                    
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String admin_login(String username,String password)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/admin_login")
                    
                    .queryString("username",username)
                    .queryString("password",password)
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String change_password(String username,String new_password)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/change_password")
                    
                    .queryString("username",username)
                    .queryString("new_password",new_password)
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    
     public static String add_department(String department_name,String description)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/add_dept")
                    .queryString("department_name",department_name)
                    .queryString("description",description)
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
      public static String question(String student_email,String question)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/question")
                    .queryString("student_email",student_email)
                    .queryString("question",question)
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    
      public static String add_course(String course_name,String department_name,String semester,String description)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/add_course")
                    .queryString("course_name",course_name)
                    .queryString("department_name",department_name)
                    .queryString("semester",semester)
                    .queryString("description",description)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
      public static String mark_attendance(String email,String date,String status,int course,String semester)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/mark_attendance")
                    .queryString("email",email)
                    .queryString("date",date)
                    .queryString("status",status)
                    .queryString("course",course+"")
                    .queryString("semester",semester)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
       public static String submit_assignment(String assignment_id,String student_email,String dateofsubmit,String file)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/submit_assignment")
                    .queryString("assignment_id",assignment_id)
                    .queryString("student_email",student_email)
                    .queryString("dateofsubmit",dateofsubmit)
                    .queryString("file",file)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     
     public static String fetch_data()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_data").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_faculty_data()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_faculty_data").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fetch_student_data()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_student_data").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fetch_chat()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_chat").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_questions()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_questions").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_all_courses()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_all_courses").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_notes_data()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_notes_data").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
      public static String check_assignment_data()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/check_assignment_data").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
        public static String fetch_student_notes(String course,String semester)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_student_notes")
                    .queryString("course",course)
                    .queryString("semester",semester)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_assignment(String course,String semester)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_assignment")
                    .queryString("course",course)
                    .queryString("semester",semester)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_selected_courses(String department_name1 )
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_selected_courses")
                    .queryString("department_name1", department_name1)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fetch_selected_faculty(String department1 )
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_selected_faculty")
                    .queryString("department1", department1)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_selected_student_data(String department1 )
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_selected_student_data")
                    .queryString("department1", department1)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_selected_student_data_based_on_course(String course,String semester )
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_selected_student_data_based_on_course")
                    .queryString("course", course)
                    .queryString("semester", semester)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_selected_notes(String course1,String semester1 )
    {
        System.out.println("rids");
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_selected_notes")
                    .queryString("course1", course1)
                    .queryString("semester1", semester1)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fill_combobox()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fill_combobox").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fill_combo_course()
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fill_combo_course").asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String fetch_courses_for_combo(String department)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_courses_for_combo")
                    .queryString("department",department)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
      public static String fill_combo_semester(int id)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fill_combo_semester")
                    .queryString("id",id)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String add_faculty(String name,String fathers_name,String mobile_no,String address,String qualification,String department,String email,File photo)
    {
        try
        {
            HttpResponse<String> res= Unirest.post("http://localhost:9000/add_faculty")
                    .queryString("name",name)
                    .queryString("fathers_name",fathers_name)
                    .queryString("mobile_no",mobile_no)
                    .queryString("address",address)
                    .queryString("qualification",qualification)
                    .queryString("department",department)
                    .queryString("email",email)
                    .field("photo", photo)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String add_time_table(String course,String semester,String teacher_id,File file)
    {
        try
        {
            HttpResponse<String> res= Unirest.post("http://localhost:9000/add_time_table")
                    .queryString("course",course)
                    .queryString("semester",semester)
                    .queryString("teacher_id",teacher_id)
                    
                    .field("file", file)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String post_answer(String chat_id,String email,String answer)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/post_answer")
                    .queryString("chat_id",chat_id)
                    .queryString("email",email)
                    .queryString("answer",answer)
                    
                   
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String post_grade(String assignment_id,String email,String grade)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/post_grade")
                    .queryString("assignment_id",assignment_id)
                    .queryString("email",email)
                    .queryString("grade",grade)
                    
                   
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String add_notes(String teacher_id,String topic,String details,String date,String type,String path,int course,String semester)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/add_notes")
                    .queryString("teacher_id",teacher_id)
                    .queryString("topic",topic)
                    .queryString("details",details)
                    .queryString("date",date)
                    .queryString("type",type)
                    .queryString("path",path)
                    .queryString("course",course+"")
                    .queryString("semester", semester)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String add_assignment(String teacher_id,String title,String detail,String date,int course,String semester,File file,String last_date)
    {
        try
        {
            HttpResponse<String> res= Unirest.post("http://localhost:9000/add_assignment")
                    .queryString("teacher_id",teacher_id)
                    .queryString("title",title)
                    .queryString("detail",detail)
                    .queryString("date",date)
                    .queryString("course",course+"")
                    .queryString("semester", semester)
                    .queryString("last_date",last_date)
                    .field("file",file)
                    
                    
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
     public static String add_students(String department,int course,String semester,String name,String fathers_name,String mobile_no,String email,String address,File photo)
    {
        try
        {
            HttpResponse<String> res= Unirest.post("http://localhost:9000/add_students")
                    .queryString("department",department)
                    .queryString("course",course+"")
                    .queryString("semester",semester)
                    .queryString("name",name)
                    .queryString("fathers_name",fathers_name)
                    .queryString("mobile_no",mobile_no)
                    .queryString("email",email)
                    .queryString("address",address)
                    
                    .field("photo", photo)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String faculty_login(String email)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/faculty_login")
                    .queryString("email",email)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String student_login(String email)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/student_login")
                    .queryString("email",email)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fetch_faculty_info(String email)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_faculty_info")
                    .queryString("email",email)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    public static String fetch_student_info(String email)
    {
        try
        {
            HttpResponse<String> res= Unirest.get("http://localhost:9000/fetch_student_info")
                    .queryString("email",email)
                    .asString();
            if(res.getStatus()==200)
            {
                return res.getBody();
            }
            else
            {
                return "server error";
            }
        }
        catch (Exception e) 
        {
            return e.toString();
        }
    }
    
}
