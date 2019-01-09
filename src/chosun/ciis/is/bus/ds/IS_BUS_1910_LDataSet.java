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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_1910_LDataSet(){}
	public IS_BUS_1910_LDataSet(String errcode, String errmsg){
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
			IS_BUS_1910_LCURLISTRecord rec = new IS_BUS_1910_LCURLISTRecord();
			rec.preng_dt = Util.checkString(rset0.getString("preng_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.spcsale_clsf = Util.checkString(rset0.getString("spcsale_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.advcs_nm = Util.checkString(rset0.getString("advcs_nm"));
			rec.remk_matt = Util.checkString(rset0.getString("remk_matt"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.make_pers = Util.checkString(rset0.getString("make_pers"));
			rec.make_pers_nm = Util.checkString(rset0.getString("make_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BUS_1910_LDataSet ds = (IS_BUS_1910_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BUS_1910_LCURLISTRecord curlistRec = (IS_BUS_1910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.preng_dt%>
<%= curlistRec.seq%>
<%= curlistRec.sale_clsf%>
<%= curlistRec.spcsale_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.advcs_nm%>
<%= curlistRec.remk_matt%>
<%= curlistRec.area_cd%>
<%= curlistRec.make_pers%>
<%= curlistRec.make_pers_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 20 21:32:03 KST 2012 */