/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EXCD_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList extncdusagecur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXCD_INITDataSet(){}
	public SS_L_EXCD_INITDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_EXCD_INITTEAMLISTRecord rec = new SS_L_EXCD_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_L_EXCD_INITPARTLISTRecord rec = new SS_L_EXCD_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_L_EXCD_INITAREALISTRecord rec = new SS_L_EXCD_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_L_EXCD_INITEXTNCDUSAGECURRecord rec = new SS_L_EXCD_INITEXTNCDUSAGECURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.extncdusagecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SS_L_EXCD_INITRESITYPECDCURRecord rec = new SS_L_EXCD_INITRESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_EXCD_INITDataSet ds = (SS_L_EXCD_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_EXCD_INITTEAMLISTRecord teamlistRec = (SS_L_EXCD_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_EXCD_INITPARTLISTRecord partlistRec = (SS_L_EXCD_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_EXCD_INITAREALISTRecord arealistRec = (SS_L_EXCD_INITAREALISTRecord)ds.arealist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.extncdusagecur.size(); i++){
		SS_L_EXCD_INITEXTNCDUSAGECURRecord extncdusagecurRec = (SS_L_EXCD_INITEXTNCDUSAGECURRecord)ds.extncdusagecur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SS_L_EXCD_INITRESITYPECDCURRecord resitypecdcurRec = (SS_L_EXCD_INITRESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getExtncdusagecur()%>
<%= ds.getResitypecdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= extncdusagecurRec.cicodeval%>
<%= extncdusagecurRec.cicdnm%>
<%= extncdusagecurRec.cicdynm%>
<%= extncdusagecurRec.ciymgbcd%>
<%= extncdusagecurRec.cicdgb%>
<%= resitypecdcurRec.cicodeval%>
<%= resitypecdcurRec.cicdnm%>
<%= resitypecdcurRec.cicdynm%>
<%= resitypecdcurRec.ciymgbcd%>
<%= resitypecdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 25 12:42:08 KST 2015 */