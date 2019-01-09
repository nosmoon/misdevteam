/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pl.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_3100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList dlco_clsfcur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_3100_MDataSet(){}
	public PL_SAL_3100_MDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			PL_SAL_3100_MMEDI_CLSFCURRecord rec = new PL_SAL_3100_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			PL_SAL_3100_MMEDI_CDCURRecord rec = new PL_SAL_3100_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			PL_SAL_3100_MDLCO_CLSFCURRecord rec = new PL_SAL_3100_MDLCO_CLSFCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.dlco_clsfcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			PL_SAL_3100_MSENDCLSFCURRecord rec = new PL_SAL_3100_MSENDCLSFCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.sendclsfcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_SAL_3100_MDataSet ds = (PL_SAL_3100_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_SAL_3100_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_SAL_3100_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_SAL_3100_MMEDI_CDCURRecord medi_cdcurRec = (PL_SAL_3100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsfcur.size(); i++){
		PL_SAL_3100_MDLCO_CLSFCURRecord dlco_clsfcurRec = (PL_SAL_3100_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PL_SAL_3100_MSENDCLSFCURRecord sendclsfcurRec = (PL_SAL_3100_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getDlco_clsfcur()%>
<%= ds.getSendclsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= medi_clsfcurRec.cd%>
<%= medi_clsfcurRec.cdnm%>
<%= medi_clsfcurRec.cd_abrv_nm%>
<%= medi_clsfcurRec.cdnm_cd%>
<%= medi_clsfcurRec.cdabrvnm_cd%>
<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.cdnm_cd%>
<%= medi_cdcurRec.cdabrvnm_cd%>
<%= dlco_clsfcurRec.cd%>
<%= dlco_clsfcurRec.cdnm%>
<%= dlco_clsfcurRec.cd_abrv_nm%>
<%= dlco_clsfcurRec.cdnm_cd%>
<%= dlco_clsfcurRec.cdabrvnm_cd%>
<%= sendclsfcurRec.cd%>
<%= sendclsfcurRec.cdnm%>
<%= sendclsfcurRec.cd_abrv_nm%>
<%= sendclsfcurRec.cdnm_cd%>
<%= sendclsfcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 08 15:15:54 KST 2009 */