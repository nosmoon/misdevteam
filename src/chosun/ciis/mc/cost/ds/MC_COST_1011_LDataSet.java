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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_1011_LDataSet(){}
	public MC_COST_1011_LDataSet(String errcode, String errmsg){
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
			MC_COST_1011_LCURLISTRecord rec = new MC_COST_1011_LCURLISTRecord();
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.cost_dstb_cd = Util.checkString(rset0.getString("cost_dstb_cd"));
			rec.cost_dstb_cdnm = Util.checkString(rset0.getString("cost_dstb_cdnm"));
			rec.cost_dstb_cd_1 = Util.checkString(rset0.getString("cost_dstb_cd_1"));
			rec.cost_dstb_cdnm_1 = Util.checkString(rset0.getString("cost_dstb_cdnm_1"));
			rec.cost_dstb_cd_2 = Util.checkString(rset0.getString("cost_dstb_cd_2"));
			rec.cost_dstb_cdnm_2 = Util.checkString(rset0.getString("cost_dstb_cdnm_2"));
			rec.cost_dept_clsf = Util.checkString(rset0.getString("cost_dept_clsf"));
			rec.prt_plac_yn = Util.checkString(rset0.getString("prt_plac_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_1011_LDataSet ds = (MC_COST_1011_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_1011_LCURLISTRecord curlistRec = (MC_COST_1011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.offi_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.cost_dstb_cd%>
<%= curlistRec.cost_dstb_cdnm%>
<%= curlistRec.cost_dstb_cd_1%>
<%= curlistRec.cost_dstb_cdnm_1%>
<%= curlistRec.cost_dstb_cd_2%>
<%= curlistRec.cost_dstb_cdnm_2%>
<%= curlistRec.cost_dept_clsf%>
<%= curlistRec.prt_plac_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 24 15:29:39 KST 2009 */