package com.oopsw.studentmange;

public class ScoreVO {
	private int scoreId;
	private int score;
	private int examId;
	private int enrollmentId;
	

	
	
	public ScoreVO(int scoreId, int score, int examId, int enrollmentId) {
		this.scoreId = scoreId;
		this.score = score;
		this.examId = examId;
		this.enrollmentId = enrollmentId;
	}
	
		public int getScoreId() {
		return scoreId;
	}

	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}



	public int getEnrollmentId() {
		return enrollmentId;
	}



	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}



	@Override
	public String toString() {
		return "ScoreVO [score=" + score + "]";
	}
}
