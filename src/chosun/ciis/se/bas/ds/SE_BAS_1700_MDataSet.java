/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1700_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sellclsflist = new ArrayList();
	public ArrayList uprcclsflist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1700_MDataSet(){}
	public SE_BAS_1700_MDataSet(String errcode, String errmsg){
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
			SE_BAS_1700_MMEDILISTRecord rec = new SE_BAS_1700_MMEDILISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medilist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SE_BAS_1700_MSELLCLSFLISTRecord rec = new SE_BAS_1700_MSELLCLSFLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.sellclsflist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SE_BAS_1700_MUPRCCLSFLISTRecord rec = new SE_BAS_1700_MUPRCCLSFLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.uprcclsflist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BAS_1700_MDataSet ds = (SE_BAS_1700_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_BAS_1700_MMEDILISTRecord medilistRec = (SE_BAS_1700_MMEDILISTRecord)ds.medilist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.sellclsflist.size(); i++){
		SE_BAS_1700_MSELLCLSFLISTRecord sellclsflistRec = (SE_BAS_1700_MSELLCLSFLISTRecord)ds.sellclsflist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.uprcclsflist.size(); i++){
		SE_BAS_1700_MUPRCCLSFLISTRecord uprcclsflistRec = (SE_BAS_1700_MUPRCCLSFLISTRecord)ds.uprcclsflist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedilist()%>
<%= ds.getSellclsflist()%>
<%= ds.getUprcclsflist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= sellclsflistRec.cd%>
<%= sellclsflistRec.cdnm%>
<%= sellclsflistRec.cd_abrv_nm%>
<%= sellclsflistRec.cdnm_cd%>
<%= sellclsflistRec.cdabrvnm_cd%>
<%= uprcclsflistRec.cd%>
<%= uprcclsflistRec.cdnm%>
<%= uprcclsflistRec.cd_abrv_nm%>
<%= uprcclsflistRec.cdnm_cd%>
<%= uprcclsflistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 27 14:27:16 KST 2014 */