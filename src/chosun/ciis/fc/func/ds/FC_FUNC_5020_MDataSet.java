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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_5020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_insr_clsf_cdlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_dlco_clsf;
	public String xx_dlco_clsf_cd;

	public FC_FUNC_5020_MDataSet(){}
	public FC_FUNC_5020_MDataSet(String errcode, String errmsg, String xx_dlco_clsf, String xx_dlco_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_dlco_clsf = xx_dlco_clsf;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_dlco_clsf(String xx_dlco_clsf){
		this.xx_dlco_clsf = xx_dlco_clsf;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_dlco_clsf(){
		return this.xx_dlco_clsf;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_5020_MXX_INSR_CLSF_CDLISTRecord rec = new FC_FUNC_5020_MXX_INSR_CLSF_CDLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_insr_clsf_cdlist.add(rec);
		}
		this.xx_dlco_clsf = Util.checkString(cstmt.getString(6));
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_5020_MDataSet ds = (FC_FUNC_5020_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.xx_insr_clsf_cdlist.size(); i++){
		FC_FUNC_5020_MXX_INSR_CLSF_CDLISTRecord xx_insr_clsf_cdlistRec = (FC_FUNC_5020_MXX_INSR_CLSF_CDLISTRecord)ds.xx_insr_clsf_cdlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_insr_clsf_cdlist()%>
<%= ds.getXx_dlco_clsf()%>
<%= ds.getXx_dlco_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= xx_insr_clsf_cdlistRec.cd_nm%>
<%= xx_insr_clsf_cdlistRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 06 19:20:55 KST 2012 */