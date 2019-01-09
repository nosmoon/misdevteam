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


package chosun.ciis.fc.sale.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.rec.*;

/**
 * 
 */


public class NM_SALE_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mediclsflist = new ArrayList();
	public ArrayList infolist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;

	public NM_SALE_1000_MDataSet(){}
	public NM_SALE_1000_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			NM_SALE_1000_MMEDILISTRecord rec = new NM_SALE_1000_MMEDILISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medilist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			NM_SALE_1000_MMEDICLSFLISTRecord rec = new NM_SALE_1000_MMEDICLSFLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.mediclsflist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			NM_SALE_1000_MINFOLISTRecord rec = new NM_SALE_1000_MINFOLISTRecord();
			rec.dtls_medi_cd = Util.checkString(rset2.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset2.getString("dtls_medi_nm"));
			rec.orgn_dtls_medi_nm = Util.checkString(rset2.getString("orgn_dtls_medi_nm"));
			this.infolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	NM_SALE_1000_MDataSet ds = (NM_SALE_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		NM_SALE_1000_MMEDILISTRecord medilistRec = (NM_SALE_1000_MMEDILISTRecord)ds.medilist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.mediclsflist.size(); i++){
		NM_SALE_1000_MMEDICLSFLISTRecord mediclsflistRec = (NM_SALE_1000_MMEDICLSFLISTRecord)ds.mediclsflist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.infolist.size(); i++){
		NM_SALE_1000_MINFOLISTRecord infolistRec = (NM_SALE_1000_MINFOLISTRecord)ds.infolist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedilist()%>
<%= ds.getMediclsflist()%>
<%= ds.getInfolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= mediclsflistRec.cd%>
<%= mediclsflistRec.cdnm%>
<%= mediclsflistRec.cd_abrv_nm%>
<%= mediclsflistRec.cdnm_cd%>
<%= mediclsflistRec.cdabrvnm_cd%>
<%= infolistRec.dtls_medi_cd%>
<%= infolistRec.dtls_medi_nm%>
<%= infolistRec.orgn_dtls_medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 18 18:31:12 KST 2013 */