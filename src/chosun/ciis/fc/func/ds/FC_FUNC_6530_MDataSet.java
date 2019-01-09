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


public class FC_FUNC_6530_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deps_isav_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_deps_isav_stat_cd;

	public FC_FUNC_6530_MDataSet(){}
	public FC_FUNC_6530_MDataSet(String errcode, String errmsg, String xx_deps_isav_stat_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_deps_isav_stat_cd = xx_deps_isav_stat_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_deps_isav_stat_cd(String xx_deps_isav_stat_cd){
		this.xx_deps_isav_stat_cd = xx_deps_isav_stat_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_deps_isav_stat_cd(){
		return this.xx_deps_isav_stat_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_6530_MDEPS_ISAV_CLSF_CDRecord rec = new FC_FUNC_6530_MDEPS_ISAV_CLSF_CDRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.deps_isav_clsf_cd.add(rec);
		}
		this.xx_deps_isav_stat_cd = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_6030_MDataSet ds = (FC_FUNC_6030_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.deps_isav_clsf_cd.size(); i++){
		FC_FUNC_6030_MDEPS_ISAV_CLSF_CDRecord deps_isav_clsf_cdRec = (FC_FUNC_6030_MDEPS_ISAV_CLSF_CDRecord)ds.deps_isav_clsf_cd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeps_isav_clsf_cd()%>
<%= ds.getXx_deps_isav_stat_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= deps_isav_clsf_cdRec.cd%>
<%= deps_isav_clsf_cdRec.cdnm%>
<%= deps_isav_clsf_cdRec.cd_abrv_nm%>
<%= deps_isav_clsf_cdRec.cdnm_cd%>
<%= deps_isav_clsf_cdRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 09 10:21:40 KST 2012 */