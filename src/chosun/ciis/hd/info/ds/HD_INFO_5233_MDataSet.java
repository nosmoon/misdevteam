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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5233_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_job_clsf_01;
	public String xx_cd_clsf_010;
	public String xx_cd_clsf_020;
	public String xx_proc_stat_010;

	public HD_INFO_5233_MDataSet(){}
	public HD_INFO_5233_MDataSet(String errcode, String errmsg, String xx_job_clsf_01, String xx_cd_clsf_010, String xx_cd_clsf_020, String xx_proc_stat_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_job_clsf_01 = xx_job_clsf_01;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_job_clsf_01(String xx_job_clsf_01){
		this.xx_job_clsf_01 = xx_job_clsf_01;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setXx_cd_clsf_020(String xx_cd_clsf_020){
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_job_clsf_01(){
		return this.xx_job_clsf_01;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public String getXx_cd_clsf_020(){
		return this.xx_cd_clsf_020;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INFO_5233_MXX_COMBO_010Record rec = new HD_INFO_5233_MXX_COMBO_010Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_combo_010.add(rec);
		}
		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(6));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(7));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(8));
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_5233_MDataSet ds = (HD_INFO_5233_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		HD_INFO_5233_MXX_COMBO_010Record xx_combo_010Rec = (HD_INFO_5233_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_cd_clsf_020()%>
<%= ds.getXx_proc_stat_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_010Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 25 15:42:24 KST 2012 */