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


package chosun.ciis.is.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1255_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SND_1255_LDataSet(){}
	public IS_SND_1255_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			IS_SND_1255_LCURLIST1Record rec = new IS_SND_1255_LCURLIST1Record();
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.bnch_qunt = Util.checkString(rset0.getString("bnch_qunt"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.acwr_reg_dt_seq = Util.checkString(rset0.getString("acwr_reg_dt_seq"));
			rec.bnch_qty = Util.checkString(rset0.getString("bnch_qty"));
			rec.cmpy_cd_nm = Util.checkString(rset0.getString("cmpy_cd_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_SND_1255_LDataSet ds = (IS_SND_1255_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_SND_1255_LCURLIST1Record curlist1Rec = (IS_SND_1255_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.asnt_dstc_cd_nm%>
<%= curlist1Rec.advcs_cd_nm%>
<%= curlist1Rec.scat_dt%>
<%= curlist1Rec.bnch_qunt%>
<%= curlist1Rec.std_cd_nm%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.acwr_reg_dt_seq%>
<%= curlist1Rec.bnch_qty%>
<%= curlist1Rec.cmpy_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 11 10:27:23 KST 2013 */