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


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2400_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList boclsf = new ArrayList();
	public String errcode;
	public String errmsg;
	public String now_toyymm;

	public SS_SLS_BRMGR_2400_ADataSet(){}
	public SS_SLS_BRMGR_2400_ADataSet(String errcode, String errmsg, String now_toyymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.now_toyymm = now_toyymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNow_toyymm(String now_toyymm){
		this.now_toyymm = now_toyymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getNow_toyymm(){
		return this.now_toyymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_SLS_BRMGR_2400_ATEAMLISTRecord rec = new SS_SLS_BRMGR_2400_ATEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_SLS_BRMGR_2400_APARTLISTRecord rec = new SS_SLS_BRMGR_2400_APARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_SLS_BRMGR_2400_AAREALISTRecord rec = new SS_SLS_BRMGR_2400_AAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_SLS_BRMGR_2400_ABOCLSFRecord rec = new SS_SLS_BRMGR_2400_ABOCLSFRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			this.boclsf.add(rec);
		}
		this.now_toyymm = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_SLS_BRMGR_2400_ADataSet ds = (SS_SLS_BRMGR_2400_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_SLS_BRMGR_2400_ATEAMLISTRecord teamlistRec = (SS_SLS_BRMGR_2400_ATEAMLISTRecord)ds.teamlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_SLS_BRMGR_2400_APARTLISTRecord partlistRec = (SS_SLS_BRMGR_2400_APARTLISTRecord)ds.partlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_SLS_BRMGR_2400_AAREALISTRecord arealistRec = (SS_SLS_BRMGR_2400_AAREALISTRecord)ds.arealist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.boclsf.size(); i++){
		SS_SLS_BRMGR_2400_ABOCLSFRecord boclsfRec = (SS_SLS_BRMGR_2400_ABOCLSFRecord)ds.boclsf.get(i);%>
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
<%= ds.getBoclsf()%>
<%= ds.getNow_toyymm()%>
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
<%= boclsfRec.cicodeval%>
<%= boclsfRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 18 18:05:34 KST 2016 */