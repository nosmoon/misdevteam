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


package chosun.ciis.hd.crcl.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.rec.*;

/**
 * 
 */


public class HD_CRCL_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_CRCL_1001_LDataSet(){}
	public HD_CRCL_1001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_CRCL_1001_LCURLISTRecord rec = new HD_CRCL_1001_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.paty_crc_cd = Util.checkString(rset0.getString("paty_crc_cd"));
			rec.bgn_dty_cd = Util.checkString(rset0.getString("bgn_dty_cd"));
			rec.end_dty_cd = Util.checkString(rset0.getString("end_dty_cd"));
			rec.fix_fix_rate_clsf = Util.checkString(rset0.getString("fix_fix_rate_clsf"));
			rec.rgla_dduc_dus = Util.checkString(rset0.getString("rgla_dduc_dus"));
			rec.rgla_dduc_ratio = Util.checkString(rset0.getString("rgla_dduc_ratio"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_CRCL_1001_LDataSet ds = (HD_CRCL_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_CRCL_1001_LCURLISTRecord curlistRec = (HD_CRCL_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.paty_crc_cd%>
<%= curlistRec.bgn_dty_cd%>
<%= curlistRec.end_dty_cd%>
<%= curlistRec.fix_fix_rate_clsf%>
<%= curlistRec.rgla_dduc_dus%>
<%= curlistRec.rgla_dduc_ratio%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 17 09:59:30 KST 2009 */