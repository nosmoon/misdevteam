/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String membercode;
	public String name;
	public String promisecode;
	public String promisedate;
	public String promiseprice;
	public String paymethodnm;
	public String partitiontype;
	public String paystartdate;
	public String payenddate;
	public String monthlypayday;
	public String monthlypayprice;
	public String partitioncount;
	public String onlineproyn;
	public String writedate;
	public String fund2;

	public TN_RPT_1600_LCURLISTRecord(){}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPromisecode(String promisecode){
		this.promisecode = promisecode;
	}

	public void setPromisedate(String promisedate){
		this.promisedate = promisedate;
	}

	public void setPromiseprice(String promiseprice){
		this.promiseprice = promiseprice;
	}

	public void setPaymethodnm(String paymethodnm){
		this.paymethodnm = paymethodnm;
	}

	public void setPartitiontype(String partitiontype){
		this.partitiontype = partitiontype;
	}

	public void setPaystartdate(String paystartdate){
		this.paystartdate = paystartdate;
	}

	public void setPayenddate(String payenddate){
		this.payenddate = payenddate;
	}

	public void setMonthlypayday(String monthlypayday){
		this.monthlypayday = monthlypayday;
	}

	public void setMonthlypayprice(String monthlypayprice){
		this.monthlypayprice = monthlypayprice;
	}

	public void setPartitioncount(String partitioncount){
		this.partitioncount = partitioncount;
	}

	public void setOnlineproyn(String onlineproyn){
		this.onlineproyn = onlineproyn;
	}

	public void setWritedate(String writedate){
		this.writedate = writedate;
	}

	public void setFund2(String fund2){
		this.fund2 = fund2;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getName(){
		return this.name;
	}

	public String getPromisecode(){
		return this.promisecode;
	}

	public String getPromisedate(){
		return this.promisedate;
	}

	public String getPromiseprice(){
		return this.promiseprice;
	}

	public String getPaymethodnm(){
		return this.paymethodnm;
	}

	public String getPartitiontype(){
		return this.partitiontype;
	}

	public String getPaystartdate(){
		return this.paystartdate;
	}

	public String getPayenddate(){
		return this.payenddate;
	}

	public String getMonthlypayday(){
		return this.monthlypayday;
	}

	public String getMonthlypayprice(){
		return this.monthlypayprice;
	}

	public String getPartitioncount(){
		return this.partitioncount;
	}

	public String getOnlineproyn(){
		return this.onlineproyn;
	}

	public String getWritedate(){
		return this.writedate;
	}

	public String getFund2(){
		return this.fund2;
	}
}

/* �ۼ��ð� : Thu Nov 24 18:18:48 KST 2016 */