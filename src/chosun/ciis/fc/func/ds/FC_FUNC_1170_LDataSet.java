/***************************************************************************************************
* ���ϸ� : SP_CO_L_RDRCRTS_GRAD_APLC.java
* ��� :  ����-����������û ��ȸ
* �ۼ����� : 2004-05-17
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :   
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * ����-����������û ��ȸ
 */

public class FC_FUNC_1170_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList notemtry = new ArrayList();
	public String errcode;
	public String errmsg;
	public long note_amtsum;
	public long thdd_mtry_extnc;

	public FC_FUNC_1170_LDataSet(){}
	public FC_FUNC_1170_LDataSet(String errcode, String errmsg, long note_amtsum, long thdd_mtry_extnc){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.note_amtsum = note_amtsum;
		this.thdd_mtry_extnc = thdd_mtry_extnc;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNote_amtsum(long note_amtsum){
		this.note_amtsum = note_amtsum;
	}

	public void setThdd_mtry_extnc(long thdd_mtry_extnc){
		this.thdd_mtry_extnc = thdd_mtry_extnc;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getNote_amtsum(){
		return this.note_amtsum;
	}

	public long getThdd_mtry_extnc(){
		return this.thdd_mtry_extnc;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.note_amtsum = cstmt.getLong(6);
		this.thdd_mtry_extnc = cstmt.getLong(7);
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_FUNC_1170_LNOTEMTRYRecord rec = new FC_FUNC_1170_LNOTEMTRYRecord();
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amtsum = Util.checkString(rset0.getString("note_amtsum"));
			this.notemtry.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1170_LDataSet ds = (FC_FUNC_1170_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.notemtry.size(); i++){
		FC_FUNC_1170_LNOTEMTRYRecord notemtryRec = (FC_FUNC_1170_LNOTEMTRYRecord)ds.notemtry.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNote_amtsum()%>
<%= ds.getThdd_mtry_extnc()%>
<%= ds.getNotemtry()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= notemtryRec.mtry_dt%>
<%= notemtryRec.note_amtsum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 05 14:42:56 KST 2009 */