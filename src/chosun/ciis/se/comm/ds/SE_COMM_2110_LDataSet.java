/***************************************************************************************************
* ���ϸ� : SE_COMM_2110_LDataSet.java
* ��� :  ���۴ܰ� �˾�
* �ۼ����� : 2009.02.18
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_COMM_2110_LDataSet(){}
	public SE_COMM_2110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_COMM_2110_LCURLISTRecord rec = new SE_COMM_2110_LCURLISTRecord();
			rec.tran_uprc_cd 		= Util.checkString(rset0.getString("tran_uprc_cd"		));
			rec.aply_dt 			= Util.checkString(rset0.getString("aply_dt"			));
			rec.tran_uprc_route_nm 	= Util.checkString(rset0.getString("tran_uprc_route_nm"	));
			rec.tran_uprc_clas 		= Util.checkString(rset0.getString("tran_uprc_clas"		));
			rec.tran_uprc_clas_nm 	= Util.checkString(rset0.getString("tran_uprc_clas_nm"	));
			rec.tran_cost 			= Util.checkString(rset0.getString("tran_cost"			));
			rec.route_clsf 			= Util.checkString(rset0.getString("route_clsf"			));
			rec.route_clsf_nm		= Util.checkString(rset0.getString("route_clsf_nm"		));
			rec.route_cd 			= Util.checkString(rset0.getString("route_cd"			));
			rec.route_nm 			= Util.checkString(rset0.getString("route_nm"			));
			rec.prt_plac_cd 		= Util.checkString(rset0.getString("prt_plac_cd"		));
			rec.prt_plac_nm 		= Util.checkString(rset0.getString("prt_plac_nm"		));
			rec.load_wgt 			= Util.checkString(rset0.getString("load_wgt"			));
			rec.route_lgth 			= Util.checkString(rset0.getString("route_lgth"			));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_COMM_2110_LDataSet ds = (SE_COMM_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_COMM_2110_LCURLISTRecord curlistRec = (SE_COMM_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.aply_dt%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.tran_uprc_clas_nm%>
<%= curlistRec.tran_cost%>
<%= curlistRec.route_clsf%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.prt_plac_nm%>
<%= curlistRec.load_wgt%>
<%= curlistRec.route_lgth%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 18 10:26:50 KST 2009 */