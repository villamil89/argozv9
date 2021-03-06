package com.myspace.argoz.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ActionManagement")
public class ActionManagement implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("predecessorCode")
	private java.lang.Integer predecessorCode;
	@org.kie.api.definition.type.Label("activityCode")
	private java.lang.Integer activityCode;
	@org.kie.api.definition.type.Label("activity")
	private java.lang.String activity;
	@org.kie.api.definition.type.Label("actionCode")
	private java.lang.String actionCode;
	@org.kie.api.definition.type.Label("numberManagement")
	private java.lang.String numberManagement;
	@org.kie.api.definition.type.Label("startDate")
	private java.util.Date startDate;
	@org.kie.api.definition.type.Label("endDate")
	private java.util.Date endDate;
	@org.kie.api.definition.type.Label("duration")
	private int duration;
	@org.kie.api.definition.type.Label("weight")
	private int weight;
	@org.kie.api.definition.type.Label("advance")
	private java.lang.Integer advance;

	public ActionManagement() {
	}

	public java.lang.Integer getPredecessorCode() {
		return this.predecessorCode;
	}

	public void setPredecessorCode(java.lang.Integer predecessorCode) {
		this.predecessorCode = predecessorCode;
	}

	public java.lang.Integer getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(java.lang.Integer activityCode) {
		this.activityCode = activityCode;
	}

	public java.lang.String getActivity() {
		return this.activity;
	}

	public void setActivity(java.lang.String activity) {
		this.activity = activity;
	}

	public java.lang.String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(java.lang.String actionCode) {
		this.actionCode = actionCode;
	}

	public java.lang.String getNumberManagement() {
		return this.numberManagement;
	}

	public void setNumberManagement(java.lang.String numberManagement) {
		this.numberManagement = numberManagement;
	}

	public java.util.Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public java.lang.Integer getAdvance() {
		return this.advance;
	}

	public void setAdvance(java.lang.Integer advance) {
		this.advance = advance;
	}

	public ActionManagement(java.lang.Integer predecessorCode,
			java.lang.Integer activityCode, java.lang.String activity,
			java.lang.String actionCode, java.lang.String numberManagement,
			java.util.Date startDate, java.util.Date endDate, int duration,
			int weight, java.lang.Integer advance) {
		this.predecessorCode = predecessorCode;
		this.activityCode = activityCode;
		this.activity = activity;
		this.actionCode = actionCode;
		this.numberManagement = numberManagement;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.weight = weight;
		this.advance = advance;
	}

}