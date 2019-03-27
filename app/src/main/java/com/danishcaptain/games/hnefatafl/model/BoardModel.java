package com.danishcaptain.games.hnefatafl.model;

import android.app.Activity;
import android.view.View;
import android.widget.TableRow;

import com.danishcaptain.games.hnefatafl.R;
import com.danishcaptain.games.hnefatafl.model.domain.Board;
import com.danishcaptain.games.hnefatafl.model.domain.Defender;
import com.danishcaptain.games.hnefatafl.model.domain.KingPiece;
import com.danishcaptain.games.hnefatafl.model.domain.Offender;
import com.danishcaptain.games.hnefatafl.model.domain.Piece;
import com.danishcaptain.games.hnefatafl.model.domain.Player;
import com.danishcaptain.games.hnefatafl.widget.CenterCastle;
import com.danishcaptain.games.hnefatafl.widget.CornerCastle;
import com.danishcaptain.games.hnefatafl.widget.DefenseLocation;
import com.danishcaptain.games.hnefatafl.widget.EmptyLocation;
import com.danishcaptain.games.hnefatafl.widget.MoveLocation;
import com.danishcaptain.games.hnefatafl.widget.OffenseLocation;

import java.util.ArrayList;
import java.util.List;

public class BoardModel implements View.OnClickListener {
    private static final int BASE = 10000;
    private final PlayerModel playerModel;
    private final PiecesModel piecesModel;
    private ArrayList<CornerCastle> corners = new ArrayList<>();
    private Board board;
    private int cellWidth;
    private int cellHeight;

    public BoardModel(PlayerModel playerModel, PiecesModel piecesModel) {
        this.playerModel = playerModel;
        this.piecesModel = piecesModel;
    }

    public void init(Activity activity) {
        board = new Board(11,11);
        cellWidth = (int) activity.getResources().getDimension(R.dimen.cell_width);
        cellHeight = (int) activity.getResources().getDimension(R.dimen.cell_height);

        //TableLayout boardView = activity.findViewById(R.id.board);
        initRow1(activity);
        initRow2(activity);
        initRow3(activity);
        initRow4(activity);
        initRow5(activity);
        initRow6(activity);
        initRow7(activity);
        initRow8(activity);
        initRow9(activity);
        initRow10(activity);
        initRow11(activity);
    }

    private void initRow1(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow1);
        int row = 0;

        addCornerCastle(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addOffenseLocation(activity, rowView, row, 3);
        addOffenseLocation(activity, rowView, row, 4);
        addOffenseLocation(activity, rowView, row, 5);
        addOffenseLocation(activity, rowView, row, 6);
        addOffenseLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addCornerCastle(activity, rowView, row, 10);
    }

    private void addEmptyLocation(Activity activity, TableRow rowView, int row, int col) {
        MoveLocation m = new EmptyLocation(activity, row, col);
        m.setId(BASE*(row+1)+(col+1));
        rowView.addView(m, cellWidth, cellHeight);
        board.set(m);
        m.setOnClickListener(this);
    }

    private void addOffenseLocation(Activity activity, TableRow rowView, int row, int col) {
        MoveLocation m  = new OffenseLocation(activity, row, col);
        m.setId(BASE*(row+1)+(col+1));
        rowView.addView(m, cellWidth, cellHeight);
        board.set(m);
        m.setOnClickListener(this);
    }

    private void addDefenseLocation(Activity activity, TableRow rowView, int row, int col) {
        MoveLocation m  = new DefenseLocation(activity, row, col);
        m.setId(BASE*(row+1)+(col+1));
        rowView.addView(m, cellWidth, cellHeight);
        board.set(m);
        m.setOnClickListener(this);
    }

    private void addCornerCastle(Activity activity, TableRow rowView, int row, int col) {
        CornerCastle m  = new CornerCastle(activity, row, col);
        m.setId(BASE*(row+1)+(col+1));
        rowView.addView(m, cellWidth, cellHeight);
        board.set(m);
        m.setOnClickListener(this);
        corners.add(m);
    }

    private void addCenterCastle(Activity activity, TableRow rowView, int row, int col) {
        MoveLocation m  = new CenterCastle(activity, row, col);
        m.setId(BASE*(row+1)+(col+1));
        rowView.addView(m, cellWidth, cellHeight);
        board.set(m);
        m.setOnClickListener(this);
    }

    private void initRow2(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow2);
        int row = 1;

        addEmptyLocation(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addOffenseLocation(activity, rowView, row, 4);
        addOffenseLocation(activity, rowView, row, 5);
        addOffenseLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addEmptyLocation(activity, rowView, row, 10);
    }

    private void initRow3(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow3);
        int row = 2;

        addEmptyLocation(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addEmptyLocation(activity, rowView, row, 4);
        addEmptyLocation(activity, rowView, row, 5);
        addEmptyLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addEmptyLocation(activity, rowView, row, 10);
    }

    private void initRow4(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow4);
        int row = 3;

        addOffenseLocation(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addEmptyLocation(activity, rowView, row, 4);
        addDefenseLocation(activity, rowView, row, 5);
        addEmptyLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addOffenseLocation(activity, rowView, row, 10);
    }

    private void initRow5(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow5);
        int row = 4;

        addOffenseLocation(activity, rowView, row, 0);
        addOffenseLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addDefenseLocation(activity, rowView, row, 4);
        addDefenseLocation(activity, rowView, row, 5);
        addDefenseLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addOffenseLocation(activity, rowView, row, 9);
        addOffenseLocation(activity, rowView, row, 10);
    }

    private void initRow6(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow6);
        int row = 5;

        addOffenseLocation(activity, rowView, row, 0);
        addOffenseLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addDefenseLocation(activity, rowView, row, 3);
        addDefenseLocation(activity, rowView, row, 4);
        addCenterCastle(activity, rowView, row, 5);
        addDefenseLocation(activity, rowView, row, 6);
        addDefenseLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addOffenseLocation(activity, rowView, row, 9);
        addOffenseLocation(activity, rowView, row, 10);
    }

    private void initRow7(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow7);
        int row = 6;

        addOffenseLocation(activity, rowView, row, 0);
        addOffenseLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addDefenseLocation(activity, rowView, row, 4);
        addDefenseLocation(activity, rowView, row, 5);
        addDefenseLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addOffenseLocation(activity, rowView, row, 9);
        addOffenseLocation(activity, rowView, row, 10);
    }

    private void initRow8(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow8);
        int row = 7;

        addOffenseLocation(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addEmptyLocation(activity, rowView, row, 4);
        addDefenseLocation(activity, rowView, row, 5);
        addEmptyLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addOffenseLocation(activity, rowView, row, 10);
    }

    private void initRow9(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow9);
        int row = 8;

        addEmptyLocation(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addEmptyLocation(activity, rowView, row, 4);
        addEmptyLocation(activity, rowView, row, 5);
        addEmptyLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addEmptyLocation(activity, rowView, row, 10);
    }

    private void initRow10(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow10);
        int row = 9;

        addEmptyLocation(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addEmptyLocation(activity, rowView, row, 3);
        addOffenseLocation(activity, rowView, row, 4);
        addOffenseLocation(activity, rowView, row, 5);
        addOffenseLocation(activity, rowView, row, 6);
        addEmptyLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addEmptyLocation(activity, rowView, row, 10);
    }

    private void initRow11(Activity activity) {
        TableRow rowView = activity.findViewById(R.id.boardRow11);
        int row = 10;

        addCornerCastle(activity, rowView, row, 0);
        addEmptyLocation(activity, rowView, row, 1);
        addEmptyLocation(activity, rowView, row, 2);
        addOffenseLocation(activity, rowView, row, 3);
        addOffenseLocation(activity, rowView, row, 4);
        addOffenseLocation(activity, rowView, row, 5);
        addOffenseLocation(activity, rowView, row, 6);
        addOffenseLocation(activity, rowView, row, 7);
        addEmptyLocation(activity, rowView, row, 8);
        addEmptyLocation(activity, rowView, row, 9);
        addCornerCastle(activity, rowView, row, 10);
    }

    @Override
    public void onClick(View v) {
        if (playerModel.isGameOver()) {
            return;
        }
        MoveLocation ml = (MoveLocation) v;
        if (ml.hasPiece()) {
            Piece p = ml.getPiece();
            Player current = playerModel.getCurrent();
            if (current.hasActive()) {
                if (current.getActive().equals(ml)) {
                    current.getActive().setActive(false);
                    current.setActive(null);
                }
            } else if (!current.hasActive() && current.isMine(p)) {
                current.setActive(ml);
                ml.setActive(true);
            }
        } else {
            Player current = playerModel.getCurrent();
            if (current.hasActive()) {
                if (isValidMove(current.getActive(), ml)) {
                    MoveLocation old = current.getActive();
                    Piece p = old.getPiece();
                    old.add(null);
                    ml.add(p);
                    current.getActive().setActive(false);
                    current.setActive(null);
                    if (ml.getPiece() instanceof Offender) {
                        checkOffenseDeletes();
                    } else if (ml.getPiece() instanceof Defender) {
                        checkDefenseDeletes();
                    }
                    checkWins();
                    playerModel.toggleCurrent();
                }
            }
        }
    }

    private void checkOffenseDeletes() {
        List<Offender> offenders = piecesModel.getOffenders();
        List<Defender> defenders = piecesModel.getDefenders();
        for (Offender o1 : offenders) {
            for (Offender o2 : offenders) {
                if (o1 == o2) {
                    continue;
                }
                if (o1.getBoardX() == o2.getBoardX()) {
                    Offender min;
                    Offender max;
                    if (o1.getBoardY() > o2.getBoardY()) {
                        min = o2;
                        max = o1;
                    } else {
                        min = o1;
                        max = o2;
                    }
                    if (max.getBoardY() > min.getBoardY()) {
                        boolean good = true;
                        ArrayList<Defender> killList = new ArrayList();
                        for (int i=min.getBoardY()+1; i<=max.getBoardY()-1; i++) {
                            MoveLocation x = this.lookupLocation(o1.getBoardX(), i);
                            if (x.hasPiece()) {
                                if (x.getPiece() instanceof Defender) {
                                    killList.add((Defender)x.getPiece());
                                } else if (x.getPiece() instanceof Offender) {
                                    good = false;
                                    break;
                                }
                            } else {
                                good = false;
                                break;
                            }
                        }
                        if (good && killList.size() > 0) {
                            for (Defender o : killList) {
                                o.kill();
                            }
                            defenders.removeAll(killList);
                        }
                    }
                } else if (o1.getBoardY() == o2.getBoardY()) {
                    Offender min;
                    Offender max;
                    if (o1.getBoardX() > o2.getBoardX()) {
                        min = o2;
                        max = o1;
                    } else {
                        min = o1;
                        max = o2;
                    }
                    if (max.getBoardX() > min.getBoardX()) {
                        boolean good = true;
                        ArrayList<Defender> killList = new ArrayList();
                        for (int i=min.getBoardX()+1; i<=max.getBoardX()-1; i++) {
                            MoveLocation x = this.lookupLocation(i, o1.getBoardY());
                            if (x.hasPiece()) {
                                if (x.getPiece() instanceof Defender) {
                                    killList.add((Defender)x.getPiece());
                                } else if (x.getPiece() instanceof Offender) {
                                    good = false;
                                    break;
                                }
                            } else {
                                good = false;
                                break;
                            }
                        }
                        if (good && killList.size() > 0) {
                            for (Defender o : killList) {
                                o.kill();
                            }
                            defenders.removeAll(killList);
                        }
                    }
                }
            }
        }
    }

    private void checkDefenseDeletes() {
        List<Offender> offenders = piecesModel.getOffenders();
        List<Defender> defenders = piecesModel.getDefenders();
        for (Defender d1 : defenders) {
            for (Defender d2 : defenders) {
                if (d1 == d2) {
                    continue;
                }
                if (d1.getBoardX() == d2.getBoardX()) {
                    Defender min;
                    Defender max;
                    if (d1.getBoardY() > d2.getBoardY()) {
                        min = d2;
                        max = d1;
                    } else {
                        min = d1;
                        max = d2;
                    }
                    if (max.getBoardY() > min.getBoardY()) {
                        boolean good = true;
                        ArrayList<Offender> killList = new ArrayList();
                        for (int i=min.getBoardY()+1; i<=max.getBoardY()-1; i++) {
                            MoveLocation x = this.lookupLocation(d1.getBoardX(), i);
                            if (x.hasPiece()) {
                                if (x.getPiece() instanceof Offender) {
                                    killList.add((Offender)x.getPiece());
                                } else if (x.getPiece() instanceof Defender) {
                                    good = false;
                                    break;
                                }
                            } else {
                                good = false;
                                break;
                            }
                        }
                        if (good && killList.size() > 0) {
                            for (Offender o : killList) {
                                o.kill();
                            }
                            offenders.removeAll(killList);
                        }
                    }
                } else if (d1.getBoardY() == d2.getBoardY()) {
                    Defender min;
                    Defender max;
                    if (d1.getBoardX() > d2.getBoardX()) {
                        min = d2;
                        max = d1;
                    } else {
                        min = d1;
                        max = d2;
                    }
                    if (max.getBoardX() > min.getBoardX()) {
                        boolean good = true;
                        ArrayList<Offender> killList = new ArrayList();
                        for (int i=min.getBoardX()+1; i<=max.getBoardX()-1; i++) {
                            MoveLocation x = this.lookupLocation(i, d1.getBoardY());
                            if (x.hasPiece()) {
                                if (x.getPiece() instanceof Offender) {
                                    killList.add((Offender)x.getPiece());
                                } else if (x.getPiece() instanceof Defender) {
                                    good = false;
                                    break;
                                }
                            } else {
                                good = false;
                                break;
                            }
                        }
                        if (good && killList.size() > 0) {
                            for (Offender o : killList) {
                                o.kill();
                            }
                            offenders.removeAll(killList);
                        }
                    }
                }
            }
        }
    }

    private void checkWins() {
        for (CornerCastle cc : corners) {
            if (cc.hasPiece()) {
                playerModel.defenseWins();
                return;
            }
        }
        List<Defender> defenders = piecesModel.getDefenders();
        for (Defender p : defenders) {
            if (p instanceof KingPiece) {
                return;
            }
        }
              playerModel.offenseWins();
    }

    private boolean isValidMove(MoveLocation ml1, MoveLocation ml2) {
        if (ml1.getBoardX() == ml2.getBoardX()) {
            boolean result = true;
            int y1 = ml1.getBoardY();
            int y2 = ml2.getBoardY();
            int min;
            int max;
            if (y1 == y2) {
                return false;
            } else if (y1 > y2) {
                min = y2;
                max = y1;
            } else {
                min = y1;
                max = y2;
            }
            for (int i=min+1; i<max; i++) {
                if (board.lookupLocation(ml1.getBoardX(), i).hasPiece()) {
                    result = false;
                    break;
                }
            }
            if (result) {
                result = ml2.allowsPiece(ml1.getPiece());
            }
            return result;
        } else if (ml1.getBoardY() == ml2.getBoardY()) {
            boolean result = true;
            int x1 = ml1.getBoardX();
            int x2 = ml2.getBoardX();
            int min;
            int max;
            if (x1 == x2) {
                return false;
            } else if (x1 > x2) {
                min = x2;
                max = x1;
            } else {
                min = x1;
                max = x2;
            }
            for (int i=min+1; i<max; i++) {
                if (board.lookupLocation(i, ml1.getBoardY()).hasPiece()) {
                    result = false;
                    break;
                }
            }
            if (result) {
                result = ml2.allowsPiece(ml1.getPiece());
            }
            return result;
        } else {
            return false;
        }
    }

    MoveLocation lookupLocation(int row, int col) {
        return board.lookupLocation(row, col);
    }

    public void reset() {
        board.reset();
    }
}
