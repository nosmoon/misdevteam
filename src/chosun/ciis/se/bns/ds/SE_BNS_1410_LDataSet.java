/***************************************************************************************************
* ���ϸ� : SE_BNS_1410_LDataSet.java
* ��� : �Ǹ�-���˹����� - ���˹��߼����ڰ���
* �ۼ����� : 2009-04-29
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_BNS_1410_LDataSet(){}
	public SE_BNS_1410_LDataSet(String errcode, String errmsg){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_BNS_1410_LCURLISTRecord rec = new SE_BNS_1410_LCURLISTRecord();
			rec.dt 			= Util.checkString(rset0.getString("dt"			));
			rec.day 		= Util.checkString(rset0.getString("day"		));
			rec.send_yn		= Util.checkString(rset0.getString("send_yn"	));
			rec.medi_cd 	= Util.checkString(rset0.getString("medi_cd"	));
			rec.basi_mm 	= Util.checkString(rset0.getString("basi_mm"	));
			rec.bns_item_cd = Util.checkString(rset0.getString("bns_item_cd"));
			rec.bns_item_nm = Util.checkString(rset0.getString("bns_item_nm"));
			rec.divn_dt 	= Util.checkString(rset0.getString("divn_dt"	));
			rec.chg_issu_dt = Util.checkString(rset0.getString("chg_issu_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BNS_1410_LDataSet ds = (SE_BNS_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1410_LCURLISTRecord curlistRec = (SE_BNS_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dt%>
<%= curlistRec.day%>
<%= curlistRec.medi_cd%>
<%= curlistRec.basi_mm%>
<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.divn_dt%>
<%= curlistRec.chg_issu_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 10:17:03 KST 2009 */