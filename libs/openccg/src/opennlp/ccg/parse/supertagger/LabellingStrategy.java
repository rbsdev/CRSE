///////////////////////////////////////////////////////////////////////////////
// Copyright (C) 2009 Dennis N. Mehay
// 
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
//////////////////////////////////////////////////////////////////////////////
package opennlp.ccg.parse.supertagger;

import java.util.Collection;
import java.util.List;
import opennlp.ccg.lexicon.Word;
import opennlp.ccg.util.Pair;
//import ml.MaxentModel;

/**
 * @author Dennis N. Mehay
 * @version $Revision: 1.2 $, $Date: 2010/09/21 04:12:41 $
 */
public interface LabellingStrategy {
	
    /**
     * A method to reset the K parameter (for word dictionaries).
     * @param newK An int to replace the int value of K.
     * @returns null.
     */
    public void setK(int newK);
    
    /** Multitag a TaggedWord and throw away the probabilities. */
    public List<String> multitag(Word thisword, Collection<Pair<String,Double>> context, double beta);
    
    /** Multitag a TaggedWord and retain the probabilities. */
    public List<Pair<Double,String>> multitagWithScores(Word thisword, Collection<Pair<String,Double>>contex, double beta);
    
}
