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


package chosun.ciis.as.artmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.artmgr.dm.*;
import chosun.ciis.as.artmgr.rec.*;

/**
 * 
 */


public class AS_ARTMGR_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ARTMGR_1002_LDataSet(){}
	public AS_ARTMGR_1002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			AS_ARTMGR_1002_LCURLISTRecord rec = new AS_ARTMGR_1002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.art_prod_no = Util.checkString(rset0.getString("art_prod_no"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.art_cate_nm = Util.checkString(rset0.getString("art_cate_nm"));
			rec.author = Util.checkString(rset0.getString("author"));
			rec.art_prod_nm = Util.checkString(rset0.getString("art_prod_nm"));
			rec.art_prod_size = Util.checkString(rset0.getString("art_prod_size"));
			rec.fram_size = Util.checkString(rset0.getString("fram_size"));
			rec.fram_yn = Util.checkString(rset0.getString("fram_yn"));
			rec.make_yymm = Util.checkString(rset0.getString("make_yymm"));
			rec.get_dt = Util.checkString(rset0.getString("get_dt"));
			rec.get_resn = Util.checkString(rset0.getString("get_resn"));
			rec.ap_amt = Util.checkString(rset0.getString("ap_amt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_tel = Util.checkString(rset0.getString("dlco_tel"));
			rec.keep_plac = Util.checkString(rset0.getString("keep_plac"));
			rec.keep_dt = Util.checkString(rset0.getString("keep_dt"));
			rec.art_prod_evlu = Util.checkString(rset0.getString("art_prod_evlu"));
			rec.last_chk_dt = Util.checkString(rset0.getString("last_chk_dt"));
			rec.dnt_clsf = Util.checkString(rset0.getString("dnt_clsf"));
			rec.dnt_clsf_nm = Util.checkString(rset0.getString("dnt_clsf_nm"));
			rec.art_prod_remk = Util.checkString(rset0.getString("art_prod_remk"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_ARTMGR_1002_LDataSet ds = (AS_ARTMGR_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ARTMGR_1002_LCURLISTRecord curlistRec = (AS_ARTMGR_1002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.art_prod_no%>
<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.art_cate_nm%>
<%= curlistRec.author%>
<%= curlistRec.art_prod_nm%>
<%= curlistRec.art_prod_size%>
<%= curlistRec.fram_size%>
<%= curlistRec.fram_yn%>
<%= curlistRec.make_yymm%>
<%= curlistRec.get_dt%>
<%= curlistRec.get_resn%>
<%= curlistRec.ap_amt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_tel%>
<%= curlistRec.keep_plac%>
<%= curlistRec.keep_dt%>
<%= curlistRec.art_prod_evlu%>
<%= curlistRec.last_chk_dt%>
<%= curlistRec.dnt_clsf%>
<%= curlistRec.dnt_clsf_nm%>
<%= curlistRec.art_prod_remk%>
<%= curlistRec.remk%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 08 10:56:42 KST 2009 */