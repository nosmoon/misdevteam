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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5533_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String text_tag;
	public String head_clsf_01_02;

	public HD_SRCH_5533_LDataSet(){}
	public HD_SRCH_5533_LDataSet(String errcode, String errmsg, String text_tag, String head_clsf_01_02){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.text_tag = text_tag;
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public void setHead_clsf_01_02(String head_clsf_01_02){
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getText_tag(){
		return this.text_tag;
	}

	public String getHead_clsf_01_02(){
		return this.head_clsf_01_02;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5533_LCURLIST1Record rec = new HD_SRCH_5533_LCURLIST1Record();
			rec.posk_gbn = Util.checkString(rset0.getString("posk_gbn"));
			rec.m_cnt = Util.checkString(rset0.getString("m_cnt"));
			rec.m_avg_saly = Util.checkString(rset0.getString("m_avg_saly"));
			rec.m_sum_saly = Util.checkString(rset0.getString("m_sum_saly"));
			rec.w_cnt = Util.checkString(rset0.getString("w_cnt"));
			rec.w_avg_saly = Util.checkString(rset0.getString("w_avg_saly"));
			rec.w_sum_saly = Util.checkString(rset0.getString("w_sum_saly"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.tot_avg_saly = Util.checkString(rset0.getString("tot_avg_saly"));
			rec.tot_sum_saly = Util.checkString(rset0.getString("tot_sum_saly"));
			this.curlist1.add(rec);
		}
		this.text_tag = Util.checkString(cstmt.getString(6));
		this.head_clsf_01_02 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SRCH_5533_LDataSet ds = (HD_SRCH_5533_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5533_LCURLIST1Record curlist1Rec = (HD_SRCH_5533_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getText_tag()%>
<%= ds.getHead_clsf_01_02()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.posk_gbn%>
<%= curlist1Rec.m_cnt%>
<%= curlist1Rec.m_avg_saly%>
<%= curlist1Rec.m_sum_saly%>
<%= curlist1Rec.w_cnt%>
<%= curlist1Rec.w_avg_saly%>
<%= curlist1Rec.w_sum_saly%>
<%= curlist1Rec.tot_cnt%>
<%= curlist1Rec.tot_avg_saly%>
<%= curlist1Rec.tot_sum_saly%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 26 18:51:10 KST 2018 */