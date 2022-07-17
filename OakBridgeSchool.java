/*
String [] studentNames = new String[]{"Abe", "Gary", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm", "Navya", "Nathan", "Noel", "Oliver", "Pamela", "Randall"};
  int [] rollNo = new int[]{101, 104, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
  int [] mathMarks = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
  int [] scienceMarks = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
  int [] englishMarks = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
  int [] languageMarks = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
  int [] socialMarks = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};

		*/

package com.jap.marksevaluation;

public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    {
		int totalMarks[]=new int [math.length];
 
		for (int i=0; i<math.length; i++)
		{
            totalMarks[i] = math[i]+science[i]+english[i]+language[i]+social[i];
		}

		return totalMarks;
    } 
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
    public int[] calculateAverageTotalMarks (int[] totalMarks)
    {
        int totalAvg[]=new int [totalMarks.length];

        for (int i=0; i<totalMarks.length; i++) 
		{
		    totalAvg[i]=totalMarks[i]/5;
		} 

		//int averageTotalMarks []=new int [];
        //averageTotalMarks=totalAvg;
        return totalAvg;
    }
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    {
	   int mathAvg=0;

	   for (int i=0; i<math.length; i++)
	   {
	   mathAvg= mathAvg+math[i];
	   }

       return mathAvg/math.length;
    }
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {
	   int scienceAvg=0;

	   for (int i=0; i<science.length; i++)
	   {
	   scienceAvg= scienceAvg+science[i];
	   }

       return scienceAvg/science.length;
    }
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {
	   int socialAvg=0;

	   for (int i=0; i<social.length; i++)
	   {
	   socialAvg= socialAvg+social[i];
	   }

       return socialAvg/social.length;
    }
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {
		int langAvg=0;

	   for (int i=0; i<language.length; i++)
	   {
	   langAvg= langAvg+language[i];
	   }

       return langAvg/language.length;
    }
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {
	   int englishAvg=0;

	   for (int i=0; i<english.length; i++)
	   {
	   englishAvg= englishAvg+english[i];
	   }

       return englishAvg/english.length;
    }
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames)
    {	
		int j=0;
        int topMarks=0;

		for (int i=0; i<totalMarks.length; i++)
		{
			if (totalMarks[i]>topMarks)
			topMarks=totalMarks[i];
		}

		 for (int i=0; i< totalMarks.length; i++)
        {
            if (totalMarks[i]>=topMarks)
            {
                j=i;
            }

        }

        //return the name of  the top scorer , extract the name from the studentNames array
        String result=null;
		result=studentNames[j];
		return result;
    }
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {
        int passFailStatus[]=new int [math.length];
		int k = 35;
 
		for (int i = 0; i < math.length; i++) {
            if (math[i] >= k) {
                if (science[i] >= k) {
                    if (english[i] >= k) {
                        if (language[i] >= k) {
                            if (social[i] >= k) {
                                passFailStatus[i] = 1;
                            } else {
                                passFailStatus[i] = 0;
                            }
                        }
                    }
                }
            }
	   }
	   return passFailStatus;
            
	}
		//for (int i=0; i<math.length; i++)
		//{
			//if ((math[i]+science[i]+social[i]+language[i]+english[i])>=175)
			//{
				// passFailStatus[i]=1;
			//}
			//else
			//{
			//	 passFailStatus[i]=0;
			//}
		//}

		
	//}
		

    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    {
		String [] failedStudent=new String [3];
		int j=0;

		for (int i=0; i<studentNames.length; i++)
		{

			if (passFailStatus[i]==0)
			{
			failedStudent[j]=studentNames[i];
			j++;
			}

		} 

		return failedStudent;   
	}
        
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students

    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    {
		String [] passedStudent=new String [17];
		int j=0;

		for (int i=0; i<studentNames.length; i++)
		{
		
			if (studentIndex[i]==1)
			{
			passedStudent[j]=studentNames[i];
			j++;
			}

		} 

		return passedStudent;   
	}
        
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
    {

       char [] grades=new char [20];

	   for (int i=0; i<averageTotalMarks.length; i++)
	   {
	   if (averageTotalMarks[i] >=90)
	   {
		   grades[i]='A';
	   }
	   else if (averageTotalMarks[i] >=80 && averageTotalMarks[i]<90)
	   {
		   grades[i]='B';
	   }
	   else if (averageTotalMarks[i] >=70 && averageTotalMarks[i]<80)
	   {
		   grades[i]='C';
	   }
	   else if (averageTotalMarks[i] >=60 && averageTotalMarks[i]<69)
	   {
		   grades[i]='D';
	   }
	   else if (averageTotalMarks[i] >=50 && averageTotalMarks[i]<60)
	   {
		   grades[i]='E';
	   }
	   else
	   {
		   grades[i]='F';
	   }

	   }

	    return grades;
    }

    //This function takes the total marks of students and roll numbers and returns the roll nos
    // in sorted order of total marks from smallest score to highest score

    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {

		int temp=0;
        int temp2=0;

        for (int i=0; i< totalMarks.length; i++)
        {
            for (int j=0; j< totalMarks.length-1; j++)
            {
                if (totalMarks[j]>totalMarks[j+1])
                {
                    temp=totalMarks[j];
                    totalMarks[j]=totalMarks[j+1];
                    totalMarks[j+1]=temp;

                    temp2=rollNos[j];
                    rollNos[j]=rollNos[j+1];
                    rollNos[j+1]=temp2;
                } 
            }
        }

		int rollNoTotalMarks[]=new int[rollNos.length];
		rollNoTotalMarks=rollNos;

        return rollNoTotalMarks;
    } 

    
}
 