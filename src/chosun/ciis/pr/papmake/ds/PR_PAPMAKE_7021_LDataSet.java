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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_7021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_7021_LDataSet(){}
	public PR_PAPMAKE_7021_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PR_PAPMAKE_7021_LCURLISTRecord rec = new PR_PAPMAKE_7021_LCURLISTRecord();
			rec.ispt_dt = Util.checkString(rset0.getString("ispt_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.ispt_clsf = Util.checkString(rset0.getString("ispt_clsf"));
			rec.ispt_cd = Util.checkString(rset0.getString("ispt_cd"));
			rec.ispt_nm = Util.checkString(rset0.getString("ispt_nm"));
			rec.ispt_clas1 = Util.checkString(rset0.getString("ispt_clas1"));
			rec.ispt_clas2 = Util.checkString(rset0.getString("ispt_clas2"));
			rec.ispt_clas3_nm = Util.checkString(rset0.getString("ispt_clas3_nm"));
			rec.ispt_clas4_nm = Util.checkString(rset0.getString("ispt_clas4_nm"));
			rec.ispt_rslt = Util.checkString(rset0.getString("ispt_rslt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.ispt_clas3 = Util.checkString(rset0.getString("ispt_clas3"));
			rec.ispt_clas4 = Util.checkString(rset0.getString("ispt_clas4"));
			rec.ispt_clas1_nm = Util.checkString(rset0.getString("ispt_clas1_nm"));
			rec.ispt_clas2_nm = Util.checkString(rset0.getString("ispt_clas2_nm"));
			rec.ispt_clsf_nm = Util.checkString(rset0.getString("ispt_clsf_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PAPMAKE_7021_LDataSet ds = (PR_PAPMAKE_7021_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_7021_LCURLISTRecord curlistRec = (PR_PAPMAKE_7021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.icpt_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.ispt_clsf%>
<%= curlistRec.ispt_cd%>
<%= curlistRec.ispt_nm%>
<%= curlistRec.ispt_clas1%>
<%= curlistRec.ispt_clas2%>
<%= curlistRec.ispt_clas1_nm%>
<%= curlistRec.ispt_clas2_nm%>
<%= curlistRec.ispt_rslt%>
<%= curlistRec.remk%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 06 17:58:39 KST 2016 */