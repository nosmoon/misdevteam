/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1120_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String medi_ser_no;
	public String medi_nm;
	public String issu_cmpy;
	public String medi_clsf;
	public String absence_clsf;
	public String uprc;
	public String dcrate;
	public String ser_no_basi;
	public String issu_clsf;
	public String end_ser_no;
	public String rsltcnt;

	public PL_COM_1120_SDataSet(){}
	public PL_COM_1120_SDataSet(String errcode, String errmsg, String medi_cd, String medi_ser_no, String medi_nm, String issu_cmpy, String medi_clsf, String absence_clsf, String uprc, String dcrate, String ser_no_basi, String issu_clsf, String end_ser_no, String rsltcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.medi_nm = medi_nm;
		this.issu_cmpy = issu_cmpy;
		this.medi_clsf = medi_clsf;
		this.absence_clsf = absence_clsf;
		this.uprc = uprc;
		this.dcrate = dcrate;
		this.ser_no_basi = ser_no_basi;
		this.issu_clsf = issu_clsf;
		this.end_ser_no = end_ser_no;
		this.rsltcnt = rsltcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setAbsence_clsf(String absence_clsf){
		this.absence_clsf = absence_clsf;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setSer_no_basi(String ser_no_basi){
		this.ser_no_basi = ser_no_basi;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setEnd_ser_no(String end_ser_no){
		this.end_ser_no = end_ser_no;
	}

	public void setRsltcnt(String rsltcnt){
		this.rsltcnt = rsltcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getAbsence_clsf(){
		return this.absence_clsf;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getSer_no_basi(){
		return this.ser_no_basi;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getEnd_ser_no(){
		return this.end_ser_no;
	}

	public String getRsltcnt(){
		return this.rsltcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medi_cd = Util.checkString(cstmt.getString(9));
		this.medi_ser_no = Util.checkString(cstmt.getString(10));
		this.medi_nm = Util.checkString(cstmt.getString(11));
		this.issu_cmpy = Util.checkString(cstmt.getString(12));
		this.medi_clsf = Util.checkString(cstmt.getString(13));
		this.absence_clsf = Util.checkString(cstmt.getString(14));
		this.uprc = Util.checkString(cstmt.getString(15));
		this.dcrate = Util.checkString(cstmt.getString(16));
		this.ser_no_basi = Util.checkString(cstmt.getString(17));
		this.issu_clsf = Util.checkString(cstmt.getString(18));
		this.end_ser_no = Util.checkString(cstmt.getString(19));
		this.rsltcnt = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1120_SDataSet ds = (PL_COM_1120_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getMedi_ser_no()%>
<%= ds.getMedi_nm()%>
<%= ds.getIssu_cmpy()%>
<%= ds.getMedi_clsf()%>
<%= ds.getAbsence_clsf()%>
<%= ds.getUprc()%>
<%= ds.getDcrate()%>
<%= ds.getSer_no_basi()%>
<%= ds.getIssu_clsf()%>
<%= ds.getEnd_ser_no()%>
<%= ds.getRsltcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */