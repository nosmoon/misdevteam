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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2801_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String spcl_plus_point;
	public String spcl_minus_point;
	public String sum;

	public HD_EVLU_2801_LDataSet(){}
	public HD_EVLU_2801_LDataSet(String errcode, String errmsg, String spcl_plus_point, String spcl_minus_point, String sum){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.spcl_plus_point = spcl_plus_point;
		this.spcl_minus_point = spcl_minus_point;
		this.sum = sum;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSpcl_plus_point(String spcl_plus_point){
		this.spcl_plus_point = spcl_plus_point;
	}

	public void setSpcl_minus_point(String spcl_minus_point){
		this.spcl_minus_point = spcl_minus_point;
	}

	public void setSum(String sum){
		this.sum = sum;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSpcl_plus_point(){
		return this.spcl_plus_point;
	}

	public String getSpcl_minus_point(){
		return this.spcl_minus_point;
	}

	public String getSum(){
		return this.sum;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.spcl_plus_point = Util.checkString(cstmt.getString(7));
		this.spcl_minus_point = Util.checkString(cstmt.getString(8));
		this.sum = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_EVLU_2801_LCURLISTRecord rec = new HD_EVLU_2801_LCURLISTRecord();
			rec.prz_pnsh_nm = Util.checkString(rset0.getString("prz_pnsh_nm"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.point = Util.checkString(rset0.getString("point"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_2801_LDataSet ds = (HD_EVLU_2801_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2801_LCURLISTRecord curlistRec = (HD_EVLU_2801_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSpcl_plus_point()%>
<%= ds.getSpcl_minus_point()%>
<%= ds.getSum()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.prz_pnsh_nm%>
<%= curlistRec.case_nm%>
<%= curlistRec.point%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 26 13:48:47 KST 2014 */