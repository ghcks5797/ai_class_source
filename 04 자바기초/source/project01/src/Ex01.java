import java.util.ArrayList;
import java.util.Scanner;

class Post {
    int id;
    String title;
    String content;

    Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}

public class BulletinBoard {
    static ArrayList<Post> posts = new ArrayList<>();
    static int nextId = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- 게시판 ---");
            System.out.println("1. 목록 보기");
            System.out.println("2. 게시글 작성");
            System.out.println("3. 게시글 보기");
            System.out.println("4. 게시글 수정");
            System.out.println("5. 게시글 삭제");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: listPosts(); break;
                case 2: writePost(); break;
                case 3: viewPost(); break;
                case 4: editPost(); break;
                case 5: deletePost(); break;
                case 0: System.out.println("종료합니다."); return;
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    static void listPosts() {
        System.out.println("\n[ 게시글 목록 ]");
        if (posts.isEmpty()) {
            System.out.println("게시글이 없습니다.");
        } else {
            for (Post post : posts) {
                System.out.printf("ID: %d | 제목: %s\n", post.id, post.title);
            }
        }
    }

    static void writePost() {
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();

        posts.add(new Post(nextId++, title, content));
        System.out.println("게시글이 작성되었습니다.");
    }

    static void viewPost() {
        System.out.print("게시글 ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Post post : posts) {
            if (post.id == id) {
                System.out.println("\n[ 게시글 상세 ]");
                System.out.println("제목: " + post.title);
                System.out.println("내용: " + post.content);
                return;
            }
        }
        System.out.println("해당 ID의 게시글이 없습니다.");
    }

    static void editPost() {
        System.out.print("수정할 게시글 ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Post post : posts) {
            if (post.id == id) {
                System.out.print("새 제목: ");
                post.title = scanner.nextLine();
                System.out.print("새 내용: ");
                post.content = scanner.nextLine();
                System.out.println("게시글이 수정되었습니다.");
                return;
            }
        }
        System.out.println("해당 ID의 게시글이 없습니다.");
    }

    static void deletePost() {
        System.out.print("삭제할 게시글 ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Post post : posts) {
            if (post.id == id) {
                posts.remove(post);
                System.out.println("게시글이 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 ID의 게시글이 없습니다.");
    }
}
