/**
 * GitHub Presentation - [Aline Oliveira]
 **/

public class Aline3232 {

    public static void main(String[] args) {

        // Personal Information
        String name = "[Aline Oliveira]";
        int age = 26;
        String education = "Computational Physics - Federal Fluminense University";
        String whatsapp = "WhatsApp: +55 21 99339-7380";
        String phone = "Phone: +55 24 99288-2665";

        // Skills
        String[] skills = {"Java", "JavaScript", "C#", "HTML", "CSS", "SQL"};

        // Tools and Environments
        String[] toolsEnvironments = {"VSCode", "NetBeans", "Linux"};

        // Professional Objective
        String objective = "Seeking a programming internship to apply and enhance my skills in a professional environment.";

        // Featured Projects
        String[] projects = {
            "Project 1: Drumkit-Base",
            "Project 2: desafio01-css"
        };

        // Contacts
        String linkedIn = "LinkedIn: [https://www.linkedin.com/in/aline-oliveira-silva-do-nascimento-317116281/]";
        String email = "Email: aline_nascimento@id.uff.br";

        // Presentation
        System.out.println("### 🌟 Welcome to My Repository!\n");
        System.out.printf("Hello! My name is %s, I'm %d years old, and I'm a student of %s. %s\n", name, age, education, objective);

        System.out.println("\n#### 🚀 Main Skills:\n");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }

        System.out.println("\n#### 🧰 Tools and Environments:\n");
        for (String tool : toolsEnvironments) {
            System.out.println("- " + tool);
        }

        System.out.println("\n#### 📚 Academic Background:\n");
        System.out.println("Currently pursuing a degree in " + education + ".");

        System.out.println("\n#### 💼 Professional Objective:\n");
        System.out.println(objective);

        System.out.println("\n#### 🛠️ Featured Projects:\n");
        for (String project : projects) {
            System.out.println(project);
        }

        System.out.println("\n#### 🤝 How to Contact Me:\n");
        System.out.println("- " + linkedIn);
        System.out.println("- " + email);
        System.out.println("- " + whatsapp);
        System.out.println("- " + phone);

        System.out.println("\n#### 🙏 Thank You for Visiting My Profile!\n");
        System.out.println("I look forward to contributing to challenging projects and learning from experienced professionals. "
                + "If you have an internship opportunity that aligns with my profile, I would be grateful to discuss how I can add value to your team.");

        System.out.println("\n---\n**Thanks for visiting my GitHub!** 🚀");
    }
}
