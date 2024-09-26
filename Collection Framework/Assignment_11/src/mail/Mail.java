package mail;

import java.time.LocalDateTime;

public class Mail {
	long mailId;
	String from;
	String subject;
	String body;
	LocalDateTime rec_time;

	public Mail(long mailId, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailId = mailId;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}

	public long getMailId() {
		return mailId;
	}

	public void setMailId(long mailId) {
		this.mailId = mailId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getRec_time() {
		return rec_time;
	}

	public void setRec_time(LocalDateTime rec_time) {
		this.rec_time = rec_time;
	}

	@Override
	public String toString() {
		return "mailId=" + mailId + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
				+ rec_time;
	}

}
