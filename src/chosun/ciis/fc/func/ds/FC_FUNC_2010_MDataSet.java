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


public class FC_FUNC_2010_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_ygyugagbcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_seci_clsf_cd;

	public FC_FUNC_2010_MDataSet(){}
	public FC_FUNC_2010_MDataSet(String errcode, String errmsg, String xx_seci_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_seci_clsf_cd = xx_seci_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_seci_clsf_cd(String xx_seci_clsf_cd){
		this.xx_seci_clsf_cd = xx_seci_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_seci_clsf_cd(){
		return this.xx_seci_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_2010_MCURDRCR_YGYUGAGBCDRecord rec = new FC_FUNC_2010_MCURDRCR_YGYUGAGBCDRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curdrcr_ygyugagbcd.add(rec);
		}
		this.xx_seci_clsf_cd = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_2010_MDataSet ds = (FC_FUNC_2010_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curdrcr_ygyugagbcd.size(); i++){
		FC_FUNC_2010_MCURDRCR_YGYUGAGBCDRecord curdrcr_ygyugagbcdRec = (FC_FUNC_2010_MCURDRCR_YGYUGAGBCDRecord)ds.curdrcr_ygyugagbcd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_ygyugagbcd()%>
<%= ds.getXx_seci_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curdrcr_ygyugagbcdRec.cd%>
<%= curdrcr_ygyugagbcdRec.cdnm%>
<%= curdrcr_ygyugagbcdRec.cd_abrv_nm%>
<%= curdrcr_ygyugagbcdRec.cdnm_cd%>
<%= curdrcr_ygyugagbcdRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 04 19:45:15 KST 2012 */