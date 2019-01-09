/***************************************************************************************************
* ���ϸ� : SE_SND_2420_LDataSet.java
* ��� : �Ǹ�-�߼۰���-���۴ܰ�����
* �ۼ����� : 2009-02-19
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2420_LDataSet(){}
	public SE_SND_2420_LDataSet(String errcode, String errmsg){
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
			SE_SND_2420_LCURLISTRecord rec = new SE_SND_2420_LCURLISTRecord();
			rec.medi_cd 		= Util.checkString(rset0.getString("medi_cd"		));
			rec.medi_nm 		= Util.checkString(rset0.getString("medi_nm"		));
			rec.sect_cd 		= Util.checkString(rset0.getString("sect_cd"		));
			rec.sect_nm 		= Util.checkString(rset0.getString("sect_nm"		));
			rec.cmpy_cd 		= Util.checkString(rset0.getString("cmpy_cd"		));
			rec.tran_uprc_cd 	= Util.checkString(rset0.getString("tran_uprc_cd"	));
			rec.send_yn 		= Util.checkString(rset0.getString("send_yn"		));
			rec.qty 			= Util.checkString(rset0.getString("qty"			));
			rec.aply_dt			= Util.checkString(rset0.getString("aply_dt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2420_LDataSet ds = (SE_SND_2420_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2420_LCURLISTRecord curlistRec = (SE_SND_2420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.chg_reg_dt%>
<%= curlistRec.chg_no%>
<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.route_clsf%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.load_wgt%>
<%= curlistRec.route_lgth%>
<%= curlistRec.rmks%>
<%= curlistRec.tran_cost%>
<%= curlistRec.tran_uprc_qty_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 19 17:42:17 KST 2009 */