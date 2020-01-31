public class School {
    private List<SectionA> fastLearners;
    private List<SectionB> slowLearners;

    public School() {
        fastLearners = new ArrayList<SectionA>();
        slowLearners = new ArrayList<SectionB>();
    }
    
    public void addFastLearner(SectionA student) {
        fastLearners.add(student);
    }
    
   public void addSlowLearner(SectionB student) {
        slowLearners.add(student);
    }
}


If a new pattern SectionC of AverageLearners wanted to be added then: ?

interface Section {
   public void study();
}


public class SectionA implements Section {
 
    public void study() {
        System.out.println("Studies");
    }
    
   public void timeToStudy() {
       System.out.println("Take Less Time");
    }
}


public class SectionC implements Section {
 
    public void study() {
        System.out.println("Studies");
    }
    
   public void toPractice() {
       System.out.println("need to practice");
    }
}


public class SectionB implements Section {
 
    public void study() {
        System.out.println("Studies");
    }
    
   public void practiceAndStudy() {
       System.out.println("Practice should be done at more time");
    }
}

public class School {
    private List<Section> typeOfSection;

    public School() {
        typeOfSection = new ArrayList<Section>();
     
    }
    
    public void addSudent(Section student) {
        typeOfSection.add(student);
    }
    
 
}
