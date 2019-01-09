/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
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


public class SS_L_EXTN_RDR_STATS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curoffilist = new ArrayList();
	public ArrayList curcmpylist = new ArrayList();
	public ArrayList curdeptlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_RDR_STATS_INITDataSet(){}
	public SS_L_EXTN_RDR_STATS_INITDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_EXTN_RDR_STATS_INITCURCMPYLISTRecord rec = new SS_L_EXTN_RDR_STATS_INITCURCMPYLISTRecord();			
			
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.curcmpylist.add(rec);
		}
		
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_EXTN_RDR_STATS_INITCUROFFILISTRecord rec = new SS_L_EXTN_RDR_STATS_INITCUROFFILISTRecord();
			
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));			
			this.curoffilist.add(rec);		
			
		}
		
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_EXTN_RDR_STATS_INITCURDEPTLISTRecord rec = new SS_L_EXTN_RDR_STATS_INITCURDEPTLISTRecord();
			
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.curdeptlist.add(rec);
		}
	}
	
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_EXTN_RDR_STATS_INITDataSet ds = (SS_L_EXTN_RDR_STATS_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cmpylist.size(); i++){
		SS_L_EXTN_RDR_STATS_INITCMPYLISTRecord cmpylistRec = (SS_L_EXTN_RDR_STATS_INITCMPYLISTRecord)ds.cmpylist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.offilist.size(); i++){
		SS_L_EXTN_RDR_STATS_INITOFFILISTRecord offilistRec = (SS_L_EXTN_RDR_STATS_INITOFFILISTRecord)ds.offilist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		SS_L_EXTN_RDR_STATS_INITDEPTLISTRecord deptlistRec = (SS_L_EXTN_RDR_STATS_INITDEPTLISTRecord)ds.deptlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCmpylist()%>
<%= ds.getOffilist()%>
<%= ds.getDeptlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cmpylistRec.cmpycd%>
<%= cmpylistRec.cmpynm%>
<%= offilistRec.officd%>
<%= offilistRec.offinm%>
<%= deptlistRec.deptcd%>
<%= deptlistRec.deptnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 10 17:06:55 KST 2012 */