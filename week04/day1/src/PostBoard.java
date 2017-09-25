public class PostBoard {

    public static void main(String[] args) {

        //objects of the PostIt class
        PostIt orange = new PostIt();
        orange.textColor = "blue";
        orange.text = "Idea 1";
        orange.backgroundColor = "orange";

        PostIt pink = new PostIt();
        pink.textColor = "black";
        pink.text = "Awesome";
        pink.backgroundColor = "pink";

        PostIt yellow = new PostIt();
        yellow.textColor = "green";
        yellow.text = "Superb!";
        yellow.backgroundColor = "yellow";


        //objects of the BlogPost class
        BlogPost johnDoe = new BlogPost();
        johnDoe.authorName = "John Doe";
        johnDoe.publicationDate = "2000.05.04.";
        johnDoe.title = "Lorem Ipsum";
        johnDoe.text = "Lorem ipsum dolor sit amet.";

        BlogPost timurban = new BlogPost();
        timurban.authorName = "Tim Urban";
        timurban.publicationDate = "2010.10.10.";
        timurban.title = "Wait but why";
        timurban.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost williamturton = new BlogPost();
        williamturton.authorName = "William Turton";
        williamturton.publicationDate = "2017.03.28.";
        williamturton.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        williamturton.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                                "When I asked to take his picture outside one of IBM’s New York City offices, " +
                                    "he told me that he wasn’t really into the whole organizer profile thing.";


        //kutya object of Animal class
        Animal kutya = new Animal();
        kutya.eat(50);
        System.out.println(kutya.hunger);
        kutya.drink(20);
        System.out.println(kutya.thirst);
        kutya.play(2, 3);
        System.out.println(kutya.thirst);
    }

}
