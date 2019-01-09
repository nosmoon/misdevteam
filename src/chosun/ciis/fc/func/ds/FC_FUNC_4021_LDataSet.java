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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4021_LDataSet(){}
	public FC_FUNC_4021_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_FUNC_4021_LCURLISTRecord rec = new FC_FUNC_4021_LCURLISTRecord();
			rec.stat_dt = Util.checkString(rset2.getString("stat_dt"));
			rec.slip_occr_dt = Util.checkString(rset2.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset2.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset2.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset2.getString("slip_arow_no"));
			rec.patr_budg_cd = Util.checkString(rset2.getString("patr_budg_cd"));
			rec.rmks = Util.checkString(rset2.getString("rmks"));
			rec.rsrt_dt = Util.checkString(rset2.getString("rsrt_dt"));
			rec.befo_note_stat_cd = Util.checkString(rset2.getString("befo_note_stat_cd"));
			rec.befo_note_stat_dt = Util.checkString(rset2.getString("befo_note_stat_dt"));
			rec.incmg_dt_tm = Util.checkString(rset2.getString("incmg_dt_tm"));
			rec.incmg_pers = Util.checkString(rset2.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset2.getString("incmg_pers_ipadd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_4021_LDataSet ds = (FC_FUNC_4021_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_4021_LCURLISTRecord curlistRec = (FC_FUNC_4021_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.stat_dt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.rmks%>
<%= curlistRec.rsrt_dt%>
<%= curlistRec.befo_note_stat_cd%>
<%= curlistRec.befo_note_stat_dt%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_ipadd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 06 15:26:35 KST 2009 */