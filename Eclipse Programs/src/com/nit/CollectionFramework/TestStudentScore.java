package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestStudentScore {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the no of Students: ");
			int noOfStudents=scanner.nextInt();
			ArrayList<Integer> studentScore=new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> allScores =new ArrayList<ArrayList<Integer>>();
			if(noOfStudents>50) {
				System.out.println("Error - Maximum 50 students allowed");
			}
			else {
			for(int i=1;i<=noOfStudents;i++) {
				System.out.println("Enter the number of Scores for Student "+i+": ");
				int noOfScore=scanner.nextInt();
				for(int j=1;j<=noOfScore;j++) {
					System.out.println("Enter Score "+j+": ");
				int score=scanner.nextInt();
				if(score<=100&&score>=0) {
					studentScore.add(score);
					allScores.add(studentScore);
				}
				else {
					System.err.println("Invalid Score ");
					j--;
				}
				}
			}
			int studentNumber=1;
			
			Iterator<ArrayList<Integer>> studentItr=allScores.iterator();
			while(studentItr.hasNext()) {
				System.out.print("Student "+studentNumber+": ");
				ArrayList<Integer> scoresArrayList=studentItr.next();
				Iterator<Integer> scoreItr=scoresArrayList.iterator();
				while(scoreItr.hasNext()) {
					System.out.print(scoreItr.next()+" ");
				}
				System.out.println();
				studentNumber++;
			}
			}
		}

	}

}

