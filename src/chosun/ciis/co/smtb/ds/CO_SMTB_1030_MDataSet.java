/***************************************************************************************************
* ���ϸ� : .java
* ��� :  ����-���ݰ�꼭-������ȸ(����Ʈ��)
* �ۼ����� : 2010-03-08
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.smtb.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * ����-���ݰ�꼭-������ȸ(����Ʈ��)
 */


public class CO_SMTB_1030_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList smtb_stat_cd_list = new ArrayList();
	public ArrayList erplace_cd_list = new ArrayList();
	public ArrayList dlco_clsf_cd_list = new ArrayList();
	public ArrayList slip_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SMTB_1030_MDataSet(){}
	public CO_SMTB_1030_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_SMTB_1030_MDLCO_CLSF_CD_LISTRecord rec = new CO_SMTB_1030_MDLCO_CLSF_CD_LISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.dlco_clsf_cd_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			CO_SMTB_1030_MERPLACE_CD_LISTRecord rec = new CO_SMTB_1030_MERPLACE_CD_LISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.erplace_cd_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			CO_SMTB_1030_MSLIP_CLSF_LISTRecord rec = new CO_SMTB_1030_MSLIP_CLSF_LISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.slip_clsf_list.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			CO_SMTB_1030_MSMTB_STAT_CD_LISTRecord rec = new CO_SMTB_1030_MSMTB_STAT_CD_LISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.smtb_stat_cd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_SMTB_1030_MDataSet ds = (CO_SMTB_1030_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.dlco_clsf_cd_list.size(); i++){
		CO_SMTB_1030_MDLCO_CLSF_CD_LISTRecord dlco_clsf_cd_listRec = (CO_SMTB_1030_MDLCO_CLSF_CD_LISTRecord)ds.dlco_clsf_cd_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.erplace_cd_list.size(); i++){
		CO_SMTB_1030_MERPLACE_CD_LISTRecord erplace_cd_listRec = (CO_SMTB_1030_MERPLACE_CD_LISTRecord)ds.erplace_cd_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.slip_clsf_list.size(); i++){
		CO_SMTB_1030_MSLIP_CLSF_LISTRecord slip_clsf_listRec = (CO_SMTB_1030_MSLIP_CLSF_LISTRecord)ds.slip_clsf_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.smtb_stat_cd_list.size(); i++){
		CO_SMTB_1030_MSMTB_STAT_CD_LISTRecord smtb_stat_cd_listRec = (CO_SMTB_1030_MSMTB_STAT_CD_LISTRecord)ds.smtb_stat_cd_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsf_cd_list()%>
<%= ds.getErplace_cd_list()%>
<%= ds.getSlip_clsf_list()%>
<%= ds.getSmtb_stat_cd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= dlco_clsf_cd_listRec.cd%>
<%= dlco_clsf_cd_listRec.cdnm%>
<%= dlco_clsf_cd_listRec.cd_abrv_nm%>
<%= dlco_clsf_cd_listRec.cdnm_cd%>
<%= dlco_clsf_cd_listRec.cdabrvnm_cd%>
<%= erplace_cd_listRec.cd%>
<%= erplace_cd_listRec.cdnm%>
<%= erplace_cd_listRec.cd_abrv_nm%>
<%= erplace_cd_listRec.cdnm_cd%>
<%= erplace_cd_listRec.cdabrvnm_cd%>
<%= slip_clsf_listRec.cd%>
<%= slip_clsf_listRec.cdnm%>
<%= slip_clsf_listRec.cd_abrv_nm%>
<%= slip_clsf_listRec.cdnm_cd%>
<%= slip_clsf_listRec.cdabrvnm_cd%>
<%= smtb_stat_cd_listRec.cd%>
<%= smtb_stat_cd_listRec.cdnm%>
<%= smtb_stat_cd_listRec.cd_abrv_nm%>
<%= smtb_stat_cd_listRec.cdnm_cd%>
<%= smtb_stat_cd_listRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 19 15:28:10 KST 2010 */