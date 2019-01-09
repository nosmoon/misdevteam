/***************************************************************************************************
* ���ϸ� : SS_MO_L_MODIHISTDataSet.java
* ��� : CIIS-�Ǹ�-������������-����Ϸα��ΰ���-��⺯��,�޴��ȣ�����̷��� ���� DataSet
* �ۼ����� : 2017-07-13
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *   CIIS-�Ǹ�-������������-����Ϸα��ΰ���-��⺯��,�޴��ȣ�����̷��� ���� DataSet
 */

public class SS_MO_L_MODIHISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dvsmodicur = new ArrayList();
	public ArrayList ptphmodicur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_L_MODIHISTDataSet(){}
	public SS_MO_L_MODIHISTDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_MO_L_MODIHISTPTPHMODICURRecord rec = new SS_MO_L_MODIHISTPTPHMODICURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.chgno = Util.checkString(rset0.getString("chgno"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.chgincmgdt = Util.checkString(rset0.getString("chgincmgdt"));
			rec.chgincmgpers = Util.checkString(rset0.getString("chgincmgpers"));
			rec.chgincmgnm = Util.checkString(rset0.getString("chgincmgnm"));
			rec.bf_ptphno = Util.checkString(rset0.getString("bf_ptphno"));
			rec.af_ptphno = Util.checkString(rset0.getString("af_ptphno"));
			rec.chgincmgremk = Util.checkString(rset0.getString("chgincmgremk"));
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			this.ptphmodicur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_MO_L_MODIHISTDVSMODICURRecord rec = new SS_MO_L_MODIHISTDVSMODICURRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.boemp_no = Util.checkString(rset1.getString("boemp_no"));
			rec.chgno = Util.checkString(rset1.getString("chgno"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.chgincmgdt = Util.checkString(rset1.getString("chgincmgdt"));
			rec.chgincmgpers = Util.checkString(rset1.getString("chgincmgpers"));
			rec.chgincmgnm = Util.checkString(rset1.getString("chgincmgnm"));
			rec.bf_dvsid = Util.checkString(rset1.getString("bf_dvsid"));
			rec.af_dvsid = Util.checkString(rset1.getString("af_dvsid"));
			rec.chgincmgremk = Util.checkString(rset1.getString("chgincmgremk"));
			rec.rnum = Util.checkString(rset1.getString("rnum"));
			this.dvsmodicur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_MO_L_MODIHISTDataSet ds = (SS_MO_L_MODIHISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptphmodicur.size(); i++){
		SS_MO_L_MODIHISTPTPHMODICURRecord ptphmodicurRec = (SS_MO_L_MODIHISTPTPHMODICURRecord)ds.ptphmodicur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.dvsmodicur.size(); i++){
		SS_MO_L_MODIHISTDVSMODICURRecord dvsmodicurRec = (SS_MO_L_MODIHISTDVSMODICURRecord)ds.dvsmodicur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtphmodicur()%>
<%= ds.getDvsmodicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ptphmodicurRec.bocd%>
<%= ptphmodicurRec.bonm%>
<%= ptphmodicurRec.boemp_no%>
<%= ptphmodicurRec.chgno%>
<%= ptphmodicurRec.flnm%>
<%= ptphmodicurRec.chgincmgdt%>
<%= ptphmodicurRec.chgincmgpers%>
<%= ptphmodicurRec.chgincmgnm%>
<%= ptphmodicurRec.bf_ptphno%>
<%= ptphmodicurRec.af_ptphno%>
<%= ptphmodicurRec.chgincmgremk%>
<%= ptphmodicurRec.rnum%>
<%= dvsmodicurRec.bocd%>
<%= dvsmodicurRec.bonm%>
<%= dvsmodicurRec.boemp_no%>
<%= dvsmodicurRec.chgno%>
<%= dvsmodicurRec.flnm%>
<%= dvsmodicurRec.chgincmgdt%>
<%= dvsmodicurRec.chgincmgpers%>
<%= dvsmodicurRec.chgincmgnm%>
<%= dvsmodicurRec.bf_dvsid%>
<%= dvsmodicurRec.af_dvsid%>
<%= dvsmodicurRec.chgincmgremk%>
<%= dvsmodicurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 13 14:32:51 KST 2017 */