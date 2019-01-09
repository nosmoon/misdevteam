/***************************************************************************************************
* ���ϸ�   : SP_AD_COM_1060_S.java
* ���     : ��������-�������ô亯 ����ȸ
* �ۼ����� : 2009-01-15
* �ۼ���   : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/


package chosun.ciis.co.job.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.co.job.rec.CO_JOB_1060_SCURLISTRecord;

/**
 * ��������-�������ô亯 ����ȸ
 */


public class CO_JOB_1060_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_JOB_1060_SDataSet(){}
	public CO_JOB_1060_SDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(7);
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			CO_JOB_1060_SCURLISTRecord rec = new CO_JOB_1060_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.cntc_seq = rset0.getInt("cntc_seq");
			rec.answer_seq = rset0.getInt("answer_seq");
			rec.answer_pers = Util.checkString(rset0.getString("answer_pers"));
			rec.answer_cont = Util.checkString(rset0.getString("answer_cont"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			rec.answer_dt = Util.checkString(rset0.getString("answer_dt"));
			rec.team_cd = Util.checkString(rset0.getString("team_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_JOB_1060_SDataSet ds = (CO_JOB_1060_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_1060_SCURLISTRecord curlistRec = (CO_JOB_1060_SCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.medi_clsf%>
<%= curlistRec.cntc_seq%>
<%= curlistRec.answer_seq%>
<%= curlistRec.answer_pers%>
<%= curlistRec.answer_cont%>
<%= curlistRec.add_file_nm%>
<%= curlistRec.answer_dt%>
<%= curlistRec.team_cd%>
<%= curlistRec.part_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 23 16:43:15 KST 2009 */