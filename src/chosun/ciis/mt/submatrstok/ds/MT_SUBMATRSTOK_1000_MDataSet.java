/***************************************************************************************************
* ���ϸ� : .java
* ��� :  �а��� �����Ϻ�
* �ۼ����� : 2013-04-29
* �ۼ��� : �輺��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.submatrstok.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.rec.MT_PRNPAP_3004_LCURLISTRecord;
import chosun.ciis.mt.submatrstok.dm.*;
import chosun.ciis.mt.submatrstok.rec.*;

/**
 * 
 */


public class MT_SUBMATRSTOK_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String use_yn;

	public MT_SUBMATRSTOK_1000_MDataSet(){}
	public MT_SUBMATRSTOK_1000_MDataSet(String errcode, String errmsg, String use_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.use_yn = use_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATRSTOK_1000_MCURLISTRecord rec = new MT_SUBMATRSTOK_1000_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		this.use_yn = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PRNPAP_3000_LDataSet ds = (MT_PRNPAP_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClos_clsf()%>
<%= ds.getClos_clsf_nm()%>
<%= ds.getDpcn_clsf()%>
<%= ds.getStokwh_clsf()%>
<%= ds.getStokmidl_clsf()%>
<%= ds.getStokmach_clsf()%>
<%= ds.getPaji_clsf()%>
<%= ds.getOth_div_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 28 11:09:33 KST 2009 */