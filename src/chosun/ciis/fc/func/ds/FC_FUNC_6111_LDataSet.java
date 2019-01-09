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


public class FC_FUNC_6111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6111_LDataSet(){}
	public FC_FUNC_6111_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_6111_LCURLISTRecord rec = new FC_FUNC_6111_LCURLISTRecord();
			rec.deps_isav_clsf_cd = Util.checkString(rset0.getString("deps_isav_clsf_cd"));
			rec.yejggbcdnm = Util.checkString(rset0.getString("yejggbcdnm"));
			rec.deps_isav_no = Util.checkString(rset0.getString("deps_isav_no"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.pymt_amt = Util.checkString(rset0.getString("pymt_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.ybjpno = Util.checkString(rset0.getString("ybjpno"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.yecompcdnm = Util.checkString(rset0.getString("yecompcdnm"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_6111_LDataSet ds = (FC_FUNC_6111_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6111_LCURLISTRecord curlistRec = (FC_FUNC_6111_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.deps_isav_clsf_cd%>
<%= curlistRec.yejggbcdnm%>
<%= curlistRec.deps_isav_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.pymt_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.ybjpno%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.yecompcdnm%>
<%= curlistRec.obj_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 16 11:58:50 KST 2009 */