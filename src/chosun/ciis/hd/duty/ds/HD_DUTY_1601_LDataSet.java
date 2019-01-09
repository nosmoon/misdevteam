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


package chosun.ciis.hd.duty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DUTY_1601_LDataSet(){}
	public HD_DUTY_1601_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_DUTY_1601_LCURLISTRecord rec = new HD_DUTY_1601_LCURLISTRecord();
			rec.clndr_ma = Util.checkString(rset0.getString("clndr_ma"));
			rec.clndr_a = Util.checkString(rset0.getString("clndr_a"));
			rec.clndr_wkdy = Util.checkString(rset0.getString("clndr_wkdy"));
			rec.clndr_b = Util.checkString(rset0.getString("clndr_b"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.clndr_c = Util.checkString(rset0.getString("clndr_c"));
			rec.vaca_cd = Util.checkString(rset0.getString("vaca_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_DUTY_1601_LDataSet ds = (HD_DUTY_1601_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_1601_LCURLISTRecord curlistRec = (HD_DUTY_1601_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.clndr_ma%>
<%= curlistRec.clndr_a%>
<%= curlistRec.clndr_wkdy%>
<%= curlistRec.clndr_b%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.clndr_c%>
<%= curlistRec.vaca_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 01 21:03:07 KST 2009 */