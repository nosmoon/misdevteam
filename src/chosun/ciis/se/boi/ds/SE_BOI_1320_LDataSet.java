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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1320_LDataSet(){}
	public SE_BOI_1320_LDataSet(String errcode, String errmsg){
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
		ResultSet rset9 = (ResultSet) cstmt.getObject(16);
		while(rset9.next()){
			SE_BOI_1320_LCURLISTRecord rec = new SE_BOI_1320_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset9.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset9.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset9.getString("bo_head_nm"));
			rec.ern = Util.checkString(rset9.getString("ern"));
			rec.bizcond = Util.checkString(rset9.getString("bizcond"));
			rec.item = Util.checkString(rset9.getString("item"));
			rec.dlco_nm = Util.checkString(rset9.getString("dlco_nm"));
			rec.zip = Util.checkString(rset9.getString("zip"));
			rec.addr = Util.checkString(rset9.getString("addr"));
			rec.presi_nm = Util.checkString(rset9.getString("presi_nm"));
			rec.presi_prn = Util.checkString(rset9.getString("presi_prn"));
			rec.presi_zip = Util.checkString(rset9.getString("presi_zip"));
			rec.presi_addr = Util.checkString(rset9.getString("presi_addr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1320_LDataSet ds = (SE_BOI_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1320_LCURLISTRecord curlistRec = (SE_BOI_1320_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.ern%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.zip%>
<%= curlistRec.addr%>
<%= curlistRec.presi_nm%>
<%= curlistRec.presi_prn%>
<%= curlistRec.presi_zip%>
<%= curlistRec.presi_addr%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 03 10:01:21 KST 2009 */