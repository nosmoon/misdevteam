/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_stlm_desty = new ArrayList();
	public ArrayList xx_bank_cd = new ArrayList();
	public ArrayList xx_expn_clsf = new ArrayList();
	public ArrayList xx_memb_clsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9600_MDataSet(){}
	public HD_AFFR_9600_MDataSet(String errcode, String errmsg){
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
			HD_AFFR_9600_MXX_STLM_DESTYRecord rec = new HD_AFFR_9600_MXX_STLM_DESTYRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			this.xx_stlm_desty.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_AFFR_9600_MXX_EXPN_CLSFRecord rec = new HD_AFFR_9600_MXX_EXPN_CLSFRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.mang_cd_2 = Util.checkString(rset1.getString("mang_cd_2"));
			rec.mang_cd_3 = Util.checkString(rset1.getString("mang_cd_3"));
			this.xx_expn_clsf.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			HD_AFFR_9600_MXX_MEMB_CLSFRecord rec = new HD_AFFR_9600_MXX_MEMB_CLSFRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			this.xx_memb_clsf.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			HD_AFFR_9600_MXX_BANK_CDRecord rec = new HD_AFFR_9600_MXX_BANK_CDRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			this.xx_bank_cd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_9600_MDataSet ds = (HD_AFFR_9600_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.xx_stlm_desty.size(); i++){
		HD_AFFR_9600_MXX_STLM_DESTYRecord xx_stlm_destyRec = (HD_AFFR_9600_MXX_STLM_DESTYRecord)ds.xx_stlm_desty.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_expn_clsf.size(); i++){
		HD_AFFR_9600_MXX_EXPN_CLSFRecord xx_expn_clsfRec = (HD_AFFR_9600_MXX_EXPN_CLSFRecord)ds.xx_expn_clsf.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_memb_clsf.size(); i++){
		HD_AFFR_9600_MXX_MEMB_CLSFRecord xx_memb_clsfRec = (HD_AFFR_9600_MXX_MEMB_CLSFRecord)ds.xx_memb_clsf.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_bank_cd.size(); i++){
		HD_AFFR_9600_MXX_BANK_CDRecord xx_bank_cdRec = (HD_AFFR_9600_MXX_BANK_CDRecord)ds.xx_bank_cd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_stlm_desty()%>
<%= ds.getXx_expn_clsf()%>
<%= ds.getXx_memb_clsf()%>
<%= ds.getXx_bank_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= xx_stlm_destyRec.cd%>
<%= xx_stlm_destyRec.cd_nm%>
<%= xx_expn_clsfRec.cd%>
<%= xx_expn_clsfRec.cd_nm%>
<%= xx_expn_clsfRec.mang_cd_2%>
<%= xx_memb_clsfRec.cd%>
<%= xx_memb_clsfRec.cd_nm%>
<%= xx_bank_cdRec.cd%>
<%= xx_bank_cdRec.cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 13 14:38:11 KST 2017 */