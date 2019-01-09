	function NFDOMSetValue(_nodeRoot, _strPattern,  _strText, _nIndex, _bAlertError){
		if (null == _nIndex)
			_nIndex = 0;
		if (null == _bAlertError)
			_bAlertError = false;
	                    
		var strError = "NFDOMSetValue() failed.\r\n\r\n"
	
		if (null == _nodeRoot) {
			if ((true == CONSTBOOL_NFDOM_SHOW_WARNING) && (true == _bAlertError)){
				strError += "xmlDoc is null.";
				alert(strError);
			}
			return false;
		}
	
		var nodeList = _nodeRoot.selectNodes(_strPattern);
		//alert("_strPattern=" + _strPattern + "\n" + nodeList.length);
		if (1 > nodeList.length ){
			if ((true == CONSTBOOL_NFDOM_SHOW_WARNING) && (true == _bAlertError)){
				strError += "no such pattern[" + _strPattern + "]\r\n" ;
				strError += _nodeRoot.xml;
				alert(strError);
			}
			return false;
		}
	
		if (nodeList.length <= _nIndex){
			if ((true == CONSTBOOL_NFDOM_SHOW_WARNING) && (true == _bAlertError)){
				strError += "nodelist size(" + _nodeList.length.toString(10) + ") is smaller than ";
				strError += "_nIndex(" + _nIndex.toString(10) + ").";
				alert(strError);
			}
			return false;
		}
	                    
		nodeList.item(_nIndex).text = _strText;
		return true;
	}