package p.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentResource")
public class StudentResource extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static List<Student> students = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (students.isEmpty()) {
            response.getWriter().println("NO record found");
            return;
        }

        for (Student s : students) {
            response.getWriter().println(
                "Name: " + s.name + ", Id: " + s.id + ", Age: " + s.age
            );
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));
        int age = Integer.parseInt(request.getParameter("age"));

        students.add(new Student(name, id, age));
        response.getWriter().println("Student Added");
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));
        int age = Integer.parseInt(request.getParameter("age"));

        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                s.name = name;
                s.age = age;
                found = true;
                break;
            }
        }

        if (found) {
            response.getWriter().println("Student Updated");
        } else {
            response.getWriter().println("Student not found");
        }
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        students.removeIf(s -> s.id == id);

        response.getWriter().println("Student Deleted");
    }
}