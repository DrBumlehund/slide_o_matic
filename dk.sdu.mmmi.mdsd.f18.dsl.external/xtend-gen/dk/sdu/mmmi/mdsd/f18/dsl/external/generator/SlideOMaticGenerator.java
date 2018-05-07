/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Authors;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Block;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Code;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.CompileDate;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Content;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.CurrentSecToC;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Date;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ExactSize;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Image;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Institute;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.List;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedList;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ProportionalSize;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Sec;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Section;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Size;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSec;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSubSec;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Table;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.TableRow;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Text;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Theme;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ToC;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.UnNumberedList;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Way;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Width;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SlideOMaticGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.doGenerateTexFile(Iterators.<Presentation>filter(resource.getAllContents(), Presentation.class).next(), fsa);
  }
  
  public void doGenerateTexFile(final Presentation p, final IFileSystemAccess2 fsa) {
    String _name = p.getName();
    String _plus = (_name + ".tex");
    fsa.generateFile(_plus, this.generateTexCode(p));
  }
  
  public CharSequence generateTexCode(final Presentation p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass{beamer}");
    _builder.newLine();
    _builder.append("\\usepackage[utf8]{inputenc}");
    _builder.newLine();
    _builder.append("\\usepackage[absolute,overlay]{textpos}");
    _builder.newLine();
    _builder.append("\\usepackage{graphicx}");
    _builder.newLine();
    _builder.append("\\usepackage[english]{babel}");
    _builder.newLine();
    _builder.append("\\usepackage{lastpage}");
    _builder.newLine();
    _builder.append("\\usepackage{minted}");
    _builder.newLine();
    _builder.append("\\setminted{autogobble, fontsize=\\footnotesize}");
    _builder.newLine();
    _builder.append("\\usepackage{tabu}");
    _builder.newLine();
    _builder.newLine();
    {
      Theme _theme = p.getTheme();
      boolean _tripleNotEquals = (_theme != null);
      if (_tripleNotEquals) {
        _builder.append("\\usetheme{");
        String _theme_1 = p.getTheme().getTheme();
        _builder.append(_theme_1);
        _builder.append("}");
        _builder.newLineIfNotEmpty();
        {
          String _themeColor = p.getTheme().getThemeColor();
          boolean _tripleNotEquals_1 = (_themeColor != null);
          if (_tripleNotEquals_1) {
            _builder.append("\\usecolortheme{");
            String _themeColor_1 = p.getTheme().getThemeColor();
            _builder.append(_themeColor_1);
            _builder.append("}");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\\title{");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    {
      String _subtitle = p.getSubtitle();
      boolean _tripleNotEquals_2 = (_subtitle != null);
      if (_tripleNotEquals_2) {
        _builder.append("\\subtitle{");
        String _subtitle_1 = p.getSubtitle();
        _builder.append(_subtitle_1);
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Authors _authors = p.getAuthors();
      boolean _tripleNotEquals_3 = (_authors != null);
      if (_tripleNotEquals_3) {
        _builder.append("\\author{");
        {
          Iterable<String> _filter = Iterables.<String>filter(p.getAuthors().getNames(), String.class);
          boolean _hasElements = false;
          for(final String a : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" \\and ", "");
            }
            _builder.append(a);
          }
        }
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Institute _institute = p.getInstitute();
      boolean _tripleNotEquals_4 = (_institute != null);
      if (_tripleNotEquals_4) {
        _builder.append("\\institute{");
        String _name_1 = p.getInstitute().getName();
        _builder.append(_name_1);
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Date _date = p.getDate();
      boolean _tripleNotEquals_5 = (_date != null);
      if (_tripleNotEquals_5) {
        {
          Date _date_1 = p.getDate();
          boolean _not = (!(_date_1 instanceof CompileDate));
          if (_not) {
            _builder.append("\\date{");
            String _date_2 = p.getDate().getDate();
            _builder.append(_date_2);
            _builder.append("}");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\\date{");
        _builder.append(" ");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{frame}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\titlepage");
    _builder.newLine();
    _builder.append("\\end{frame}");
    _builder.newLine();
    _builder.newLine();
    {
      Iterable<Slide> _filter_1 = Iterables.<Slide>filter(p.getSlides(), Slide.class);
      for(final Slide s : _filter_1) {
        CharSequence _generateSlideCode = this.generateSlideCode(s);
        _builder.append(_generateSlideCode);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSlideCode(final Slide s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Section _sec = s.getSec();
      boolean _tripleNotEquals = (_sec != null);
      if (_tripleNotEquals) {
        CharSequence _generateSectionsCode = this.generateSectionsCode(s.getSec(), s.getName());
        _builder.append(_generateSectionsCode);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\begin{frame}");
    {
      boolean _hasCode = this.hasCode(s);
      if (_hasCode) {
        _builder.append("[fragile]");
      }
    }
    {
      String _name = s.getName();
      boolean _tripleNotEquals_1 = (_name != null);
      if (_tripleNotEquals_1) {
        _builder.append("{");
        String _name_1 = s.getName();
        _builder.append(_name_1);
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Content> _contents = s.getContents();
      for(final Content c : _contents) {
        CharSequence _generateContentsCode = this.generateContentsCode(c);
        _builder.append(_generateContentsCode);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{frame}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSectionsCode(final Section s, final String name) {
    String _switchResult = null;
    boolean _matched = false;
    if (s instanceof Sec) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\section{");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (s instanceof SubSec) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\subsection{");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SubSubSec) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\subsubsection{");
        _switchResult = _builder.toString();
      }
    }
    String _plus = (_switchResult + name);
    return (_plus + "}");
  }
  
  public CharSequence generateContentsCode(final Content c) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (c instanceof ToC) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\tableofcontents");
      {
        if ((c instanceof CurrentSecToC)) {
          _builder.append("[sections=\\value{section}]");
        } else {
          _builder.append("[hideallsubsections]");
        }
      }
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (c instanceof Text) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        String _text = ((Text)c).getText();
        _builder.append(_text);
        _builder.append("}");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (c instanceof Block) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\begin{block}");
        {
          String _name = ((Block)c).getName();
          boolean _tripleNotEquals = (_name != null);
          if (_tripleNotEquals) {
            _builder.append("{");
            String _name_1 = ((Block)c).getName();
            _builder.append(_name_1);
            _builder.append("}");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          EList<Content> _content = ((Block)c).getContent();
          for(final Content bc : _content) {
            CharSequence _generateContentsCode = this.generateContentsCode(bc);
            _builder.append(_generateContentsCode);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\\end{block}");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (c instanceof List) {
        _matched=true;
        _switchResult = this.generateListsCode(((List)c));
      }
    }
    if (!_matched) {
      if (c instanceof Image) {
        _matched=true;
        String _xblockexpression = null;
        {
          final String src = ((Image)c).getSrc().replace("\\", "/");
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\\begin{center}");
          _builder.newLine();
          _builder.append("\\includegraphics[");
          CharSequence _string = this.getString(((Image)c).getSize());
          _builder.append(_string);
          _builder.append("]{");
          _builder.append(src);
          _builder.append("}");
          _builder.newLineIfNotEmpty();
          _builder.append("\\end{center}");
          _builder.newLine();
          _xblockexpression = _builder.toString();
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (c instanceof Table) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\begin{tabular}{");
        {
          EList<TableRow> _rows = ((Table)c).getRows();
          for(final TableRow i : _rows) {
            _builder.append("|c");
          }
        }
        _builder.append("|}");
        _builder.newLineIfNotEmpty();
        _builder.append("\\hline");
        _builder.newLine();
        {
          EList<TableRow> _rows_1 = ((Table)c).getRows();
          for(final TableRow row : _rows_1) {
            {
              EList<String> _values = row.getValues();
              boolean _hasElements = false;
              for(final String v : _values) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(" & ", "");
                }
                _builder.append(v);
              }
            }
            _builder.append(" \\\\ \\hline");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\\end{tabular}");
        _builder.newLine();
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (c instanceof Code) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\begin{minted}{");
        String _lang = ((Code)c).getLang();
        _builder.append(_lang);
        _builder.append("}");
        _builder.newLineIfNotEmpty();
        String _code = ((Code)c).getCode();
        _builder.append(_code);
        _builder.newLineIfNotEmpty();
        _builder.append("\\end{minted}");
        _builder.newLine();
        _switchResult = _builder.toString();
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    {
      String _click = c.getClick();
      boolean _tripleNotEquals = (_click != null);
      if (_tripleNotEquals) {
        _builder.append("\\pause");
      }
    }
    return (_switchResult + _builder.toString());
  }
  
  protected CharSequence _generateListsCode(final NumberedList nl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    {
      EList<ListItem> _items = nl.getItems();
      for(final ListItem i : _items) {
        _builder.append("\\item ");
        String _item = i.getItem();
        _builder.append(_item);
        {
          List _nestedList = i.getNestedList();
          boolean _tripleNotEquals = (_nestedList != null);
          if (_tripleNotEquals) {
            CharSequence _generateListsCode = this.generateListsCode(i.getNestedList());
            _builder.append(_generateListsCode);
          }
        }
        _builder.append(" ");
        {
          String _click = i.getClick();
          boolean _tripleNotEquals_1 = (_click != null);
          if (_tripleNotEquals_1) {
            _builder.append("\\pause");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateListsCode(final UnNumberedList nl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    {
      EList<ListItem> _items = nl.getItems();
      for(final ListItem i : _items) {
        _builder.append("\\item ");
        String _item = i.getItem();
        _builder.append(_item);
        {
          List _nestedList = i.getNestedList();
          boolean _tripleNotEquals = (_nestedList != null);
          if (_tripleNotEquals) {
            CharSequence _generateListsCode = this.generateListsCode(i.getNestedList());
            _builder.append(_generateListsCode);
          }
        }
        _builder.append(" ");
        {
          String _click = i.getClick();
          boolean _tripleNotEquals_1 = (_click != null);
          if (_tripleNotEquals_1) {
            _builder.append("\\pause");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Function to convert the size of floats into the correct LaTeX string.
   */
  public CharSequence getString(final Size s) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (s instanceof ProportionalSize) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      {
        Way _way = ((ProportionalSize)s).getWay();
        if ((_way instanceof Width)) {
          _builder.append("width=");
          int _scale = ((ProportionalSize)s).getScale();
          float _divide = (_scale / 100f);
          _builder.append(_divide);
          _builder.append("\\textwidth");
        } else {
          _builder.append("height=");
          int _scale_1 = ((ProportionalSize)s).getScale();
          float _divide_1 = (_scale_1 / 100f);
          _builder.append(_divide_1);
          _builder.append("\\textheight");
        }
      }
      _switchResult = _builder;
    }
    if (!_matched) {
      if (s instanceof ExactSize) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _size = ((ExactSize)s).getSize();
        _builder.append(_size);
        String _unit = ((ExactSize)s).getUnit();
        _builder.append(_unit);
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  /**
   * Function to check if the slide contains code
   * used to add the "[fragile]" to the slide, in order to support minted.
   */
  public boolean hasCode(final Slide s) {
    EList<Content> _contents = s.getContents();
    for (final Content c : _contents) {
      if ((c instanceof Code)) {
        return true;
      }
    }
    return false;
  }
  
  public CharSequence generateListsCode(final List nl) {
    if (nl instanceof NumberedList) {
      return _generateListsCode((NumberedList)nl);
    } else if (nl instanceof UnNumberedList) {
      return _generateListsCode((UnNumberedList)nl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(nl).toString());
    }
  }
}
